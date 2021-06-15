package com.egen.model;

import com.egen.model.enums.OrderStatus;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private String order_id;
    private OrderStatus order_status;
    private String customer_id;
    private double order_total;
    private double order_subTotal;
    private double shipping_charges;
    private double order_tax;
    private Billing billing_address;
    private Shipping shipping_address;
    private List<OrderItem> orderItemList = new ArrayList<OrderItem>();
    private List<Payment> paymentList = new ArrayList<Payment>();
    private ZonedDateTime order_created;
    private ZonedDateTime order_update;

    public Order(){
        this.order_id = UUID.randomUUID().toString();
        this.order_status = OrderStatus.ORDER_PENDING;
    }

    public Order(String order_id, OrderStatus order_status, String customer_id, double order_total, double order_subTotal, double shipping_charges, double order_tax, Billing billing_address, Shipping shipping_address, List<OrderItem> orderItemList, List<Payment> paymentList, ZonedDateTime order_created, ZonedDateTime order_update) {
        this.order_id = UUID.randomUUID().toString();
        this.order_status = order_status;
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
