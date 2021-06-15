package com.egen.model;
//

import java.util.List;

public class Order {

    private String id;
    private String status;
    private String order_customer_id;
    private List<Product> products;
    private double order_subtotal;
    private String order_tax;
    private String order_shipping_charges;
    private String order_total;
    private List<Payment> payment;
    private Address order_billing_address;
    private Address order_shipping_address;

    public Order(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order(String status, String order_customer_id, List<Product> products, double order_subtotal, String order_tax,
                 String order_shipping_charges, String order_total, List<Payment> payment,
                 Address order_billing_address, Address order_shipping_address) {
        this.status = status;
        this.order_customer_id = order_customer_id;
        this.products = products;
        this.order_subtotal = order_subtotal;
        this.order_tax = order_tax;
        this.order_shipping_charges = order_shipping_charges;
        this.order_total = order_total;
        this.payment = payment;
        this.order_billing_address = order_billing_address;
        this.order_shipping_address = order_shipping_address;
    }

    public String getOrderStatus() {
        return status;
    }

    public String getOrderCustomerId() {
        return order_customer_id;
    }

    public void setOrderCustomerId(String order_customer_id) {
        this.order_customer_id = order_customer_id;
    }

    public List<Product> getOrderProducts() {
        return products;
    }

    public void setOrderProducts(List<Product> products) {
        this.products = products;
    }

    public double getOrderSubtotal() {
        return order_subtotal;
    }

    public void setOrderSubtotal(double order_subtotal) {
        this.order_subtotal = order_subtotal;
    }

    public String getOrderTax() {
        return order_tax;
    }

    public void setOrderTax(String order_tax) {
        this.order_tax = order_tax;
    }

    public String getOrderShippingCharges() {
        return order_shipping_charges;
    }

    public void setOrderShippingCharges(String order_shipping_charges) {
        this.order_shipping_charges = order_shipping_charges;
    }
    public String getOrder_total() {
        return order_total;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public void setOrder_total(String order_total) {
        this.order_total = order_total;
    }


    public Address getOrder_billing_address() {
        return order_billing_address;
    }

    public void setOrder_billing_address(Address order_billing_address) {
        this.order_billing_address = order_billing_address;
    }

    public Address getOrder_shipping_address() {
        return order_shipping_address;
    }

    public void setOrder_shipping_address(Address order_shipping_address) {
        this.order_shipping_address = order_shipping_address;
    }
}
