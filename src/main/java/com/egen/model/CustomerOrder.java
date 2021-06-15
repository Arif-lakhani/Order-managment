
package com.egen.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

    private double order_total;
    private double order_subtotal;
    private double order_tax;

    @OneToOne
    @JoinColumn(name = "order_status_code")
    private OrderStatus order_status;

    private ZonedDateTime creation_time;
    private ZonedDateTime modification_time;
    private double order_shipping_charges;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderItem> items;

    @OneToOne
    @JoinColumn(name = "payment_method_code")
    private OrderPayment order_payment;

    @OneToOne
    @JoinColumn(name = "shipping_method_code")
    private ShippingMethod shipping;

    @OneToOne
    @JoinColumn(name="address_id", nullable=false)
    private CustomerAddress shipping_address;

    @OneToOne
    @JoinColumn(name="address_id", nullable=false)
    private CustomerAddress billing_address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOrder_total() {
        return order_total;
    }

    public void setOrder_total(double order_total) {
        this.order_total = order_total;
    }

    public double getOrder_subtotal() {
        return order_subtotal;
    }

    public void setOrder_subtotal(double order_subtotal) {
        this.order_subtotal = order_subtotal;
    }

    public double getOrder_tax() {
        return order_tax;
    }

    public void setOrder_tax(double order_tax) {
        this.order_tax = order_tax;
    }

    public OrderStatus getOrder_status() {
        return order_status;
    }

    public void setOrder_status(OrderStatus order_status) {
        this.order_status = order_status;
    }

    public ZonedDateTime getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(ZonedDateTime creation_time) {
        this.creation_time = creation_time;
    }

    public ZonedDateTime getModification_time() {
        return modification_time;
    }

    public void setModification_time(ZonedDateTime modification_time) {
        this.modification_time = modification_time;
    }

    public double getOrder_shipping_charges() {
        return order_shipping_charges;
    }

    public void setOrder_shipping_charges(double order_shipping_charges) {
        this.order_shipping_charges = order_shipping_charges;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public OrderPayment getOrder_payment() {
        return order_payment;
    }

    public void setOrder_payment(OrderPayment order_payment) {
        this.order_payment = order_payment;
    }

    public ShippingMethod getShipping() {
        return shipping;
    }

    public void setShipping(ShippingMethod shipping) {
        this.shipping = shipping;
    }

    public CustomerAddress getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(CustomerAddress shipping_address) {
        this.shipping_address = shipping_address;
    }

    public CustomerAddress getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(CustomerAddress billing_address) {
        this.billing_address = billing_address;
    }
}