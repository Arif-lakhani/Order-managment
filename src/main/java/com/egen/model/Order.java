package com.egen.model;
//

public class Order {

    private String id;
    private String status;
    private String order_customer_id;
    private String order_item_name;
    private String order_item_qty;
    private String order_subtotal;
    private String order_tax;
    private String order_shipping_charges;
    private String order_total;
    private String order_payment_method;
    private String order_payment_date;
    private String order_payment_confirmation_number;
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
    public Order(String status, String order_customer_id, String order_item_name,
                 String order_item_qty, String order_subtotal, String order_tax,
                 String order_shipping_charges, String order_total, String order_payment_method,
                 String order_payment_date, String order_payment_confirmation_number,
                 Address order_billing_address,Address order_shipping_address) {
        this.status = status;
        this.order_customer_id = order_customer_id;
        this.order_item_name = order_item_name;
        this.order_item_qty = order_item_qty;
        this.order_subtotal = order_subtotal;
        this.order_tax = order_tax;
        this.order_shipping_charges = order_shipping_charges;
        this.order_total = order_total;
        this.order_payment_method = order_payment_method;
        this.order_payment_date = order_payment_date;
        this.order_payment_confirmation_number = order_payment_confirmation_number;
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

    public String getOrderItemName() {
        return order_item_name;
    }

    public void setOrderItemName(String order_item_name) {
        this.order_item_name = order_item_name;
    }

    public String getOrderItemQty() {
        return order_item_qty;
    }

    public void setOrderItemQty(String order_item_qty) {
        this.order_item_qty = order_item_qty;
    }

    public String getOrderSubtotal() {
        return order_subtotal;
    }

    public void setOrderSubtotal(String order_subtotal) {
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

    public void setOrder_total(String order_total) {
        this.order_total = order_total;
    }

    public String getOrder_payment_method() {
        return order_payment_method;
    }

    public void setOrder_payment_method(String order_payment_method) {
        this.order_payment_method = order_payment_method;
    }

    public String getOrder_payment_date() {
        return order_payment_date;
    }

    public void setOrder_payment_date(String order_payment_date) {
        this.order_payment_date = order_payment_date;
    }

    public String getOrder_payment_confirmation_number() {
        return order_payment_confirmation_number;
    }

    public void setOrder_payment_confirmation_number(String order_payment_confirmation_number) {
        this.order_payment_confirmation_number = order_payment_confirmation_number;
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
