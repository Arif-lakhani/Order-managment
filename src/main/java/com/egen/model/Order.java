package com.egen.model;

import com.egen.model.enums.OrderStatus;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
@NamedQueries({
                    @NamedQuery(name="Order.findAll",query = "SELECT order FROM Order order"),
                    @NamedQuery(name="Order.findWithinInterVal",query = "SELECT order FROM Order order WHERE order.order_created>=:paramStartTime AND order.order_created<=:paramEndTime"),
                    @NamedQuery(name="Order.findTop10OrdersWithHighestDollarAmountInZip",query = "SELECT order FROM Order order WHERE order.billing_address.order_billing_zip>=:paramZip ORDER BY order.order_total DESC")
                })

public class Order {
    @Id
    @Column(name = "order_id", columnDefinition = "VARCHAR(36)")
    private String order_id;

    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus order_status;

    @Column(name = "customer_id")
    private String customer_id;

    @Column(name = "order_total")
    private double order_total;

    @Column(name = "order_subTotal")
    private double order_subTotal;

    @Column(name = "shipping_charges")
    private double shipping_charges;

    @Column(name = "order_tax")
    private double order_tax;

    @OneToOne
    private Billing billing_address;

    @OneToOne
    private Shipping shipping_address;

    @OneToMany
    private List<OrderItem> orderItemList;

    @OneToMany
    private List<Payment> paymentList;

    @Column(name = "order_created")
    private ZonedDateTime order_created;

    @Column(name = "order_updated")
    private ZonedDateTime order_update;

    public Order(){
        this.order_id = UUID.randomUUID().toString();
        this.order_status = OrderStatus.ORDER_PENDING;
    }

    public Order(String order_id, OrderStatus order_status, String customer_id, double order_total, double order_subTotal, double shipping_charges, double order_tax, Billing billing_address, Shipping shipping_address, List<OrderItem> orderItemList, List<Payment> paymentList, ZonedDateTime order_created, ZonedDateTime order_update) {
        this.order_id = UUID.randomUUID().toString();
        this.order_status = OrderStatus.ORDER_PENDING;;
        this.customer_id = customer_id;
        this.order_total = order_total;
        this.order_subTotal = order_subTotal;
        this.shipping_charges = shipping_charges;
        this.order_tax = order_tax;
        this.billing_address = billing_address;
        this.shipping_address = shipping_address;
        this.orderItemList = orderItemList;
        this.paymentList = paymentList;
        this.order_created = order_created;
        this.order_update = order_update;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public OrderStatus getOrder_status() {
        return order_status;
    }

    public void setOrder_status(OrderStatus order_status) {
        this.order_status = order_status;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public double getOrder_total() {
        return order_total;
    }

    public void setOrder_total(double order_total) {
        this.order_total = order_total;
    }

    public double getOrder_subTotal() {
        return order_subTotal;
    }

    public void setOrder_subTotal(double order_subTotal) {
        this.order_subTotal = order_subTotal;
    }

    public double getShipping_charges() {
        return shipping_charges;
    }

    public void setShipping_charges(double shipping_charges) {
        this.shipping_charges = shipping_charges;
    }

    public double getOrder_tax() {
        return order_tax;
    }

    public void setOrder_tax(double order_tax) {
        this.order_tax = order_tax;
    }

    public Billing getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(Billing billing_address) {
        this.billing_address = billing_address;
    }

    public Shipping getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(Shipping shipping_address) {
        this.shipping_address = shipping_address;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public ZonedDateTime getOrder_created() {
        return order_created;
    }

    public void setOrder_created(ZonedDateTime order_created) {
        this.order_created = order_created;
    }

    public ZonedDateTime getOrder_update() {
        return order_update;
    }

    public void setOrder_update(ZonedDateTime order_update) {
        this.order_update = order_update;
    }
}
