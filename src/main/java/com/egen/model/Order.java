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
    private String order_billing_addressline1;
    private String order_billing_addressline2;
    private String order_billing_city;
    private String order_billing_state;
    private String order_billing_zip;
    private String order_shipping_addressline1;
    private String order_shipping_addressline2;
    private String order_shipping_city;
    private String order_shipping_state;
    private String order_shipping_zip;

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
                 String order_billing_addressline1, String order_billing_addressline2,
                 String order_billing_city, String order_billing_state, String order_billing_zip,
                 String order_shipping_addressline1, String order_shipping_addressline2,
                 String order_shipping_city, String order_shipping_state, String order_shipping_zip) {
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
        this.order_billing_addressline1 = order_billing_addressline1;
        this.order_billing_addressline2 = order_billing_addressline2;
        this.order_billing_city = order_billing_city;
        this.order_billing_state = order_billing_state;
        this.order_billing_zip = order_billing_zip;
        this.order_shipping_addressline1 = order_shipping_addressline1;
        this.order_shipping_addressline2 = order_shipping_addressline2;
        this.order_shipping_city = order_shipping_city;
        this.order_shipping_state = order_shipping_state;
        this.order_shipping_zip = order_shipping_zip;
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

    public String getOrder_billing_addressline1() {
        return order_billing_addressline1;
    }

    public void setOrder_billing_addressline1(String order_billing_addressline1) {
        this.order_billing_addressline1 = order_billing_addressline1;
    }

    public String getOrder_billing_addressline2() {
        return order_billing_addressline2;
    }

    public void setOrder_billing_addressline2(String order_billing_addressline2) {
        this.order_billing_addressline2 = order_billing_addressline2;
    }

    public String getOrder_billing_city() {
        return order_billing_city;
    }

    public void setOrder_billing_city(String order_billing_city) {
        this.order_billing_city = order_billing_city;
    }

    public String getOrder_billing_state() {
        return order_billing_state;
    }

    public void setOrder_billing_state(String order_billing_state) {
        this.order_billing_state = order_billing_state;
    }

    public String getOrder_billing_zip() {
        return order_billing_zip;
    }

    public void setOrder_billing_zip(String order_billing_zip) {
        this.order_billing_zip = order_billing_zip;
    }

    public String getOrder_shipping_addressline1() {
        return order_shipping_addressline1;
    }

    public void setOrder_shipping_addressline1(String order_shipping_addressline1) {
        this.order_shipping_addressline1 = order_shipping_addressline1;
    }

    public String getOrder_shipping_addressline2() {
        return order_shipping_addressline2;
    }

    public void setOrder_shipping_addressline2(String order_shipping_addressline2) {
        this.order_shipping_addressline2 = order_shipping_addressline2;
    }

    public String getOrder_shipping_city() {
        return order_shipping_city;
    }

    public void setOrder_shipping_city(String order_shipping_city) {
        this.order_shipping_city = order_shipping_city;
    }

    public String getOrder_shipping_state() {
        return order_shipping_state;
    }

    public void setOrder_shipping_state(String order_shipping_state) {
        this.order_shipping_state = order_shipping_state;
    }

    public String getOrder_shipping_zip() {
        return order_shipping_zip;
    }

    public void setOrder_shipping_zip(String order_shipping_zip) {
        this.order_shipping_zip = order_shipping_zip;
    }
}
