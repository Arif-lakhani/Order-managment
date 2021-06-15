package com.egen.model;

import java.util.UUID;

public class OrderItem {

    private String order_id;
    private String order_item_id;
    private String order_item_name;
    private int order_item_qty;
    private double order_item_price;

    public OrderItem(){
        this.order_item_id = UUID.randomUUID().toString();
    }

    public OrderItem(String order_id, String order_item_id, String order_item_name, int order_item_qty, double order_item_price) {
        this.order_id = UUID.randomUUID().toString();
        this.order_item_id = order_item_id;
        this.order_item_name = order_item_name;
        this.order_item_qty = order_item_qty;
        this.order_item_price = order_item_price;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(String order_item_id) {
        this.order_item_id = order_item_id;
    }

    public String getOrder_item_name() {
        return order_item_name;
    }

    public void setOrder_item_name(String order_item_name) {
        this.order_item_name = order_item_name;
    }

    public int getOrder_item_qty() {
        return order_item_qty;
    }

    public void setOrder_item_qty(int order_item_qty) {
        this.order_item_qty = order_item_qty;
    }

    public double getOrder_item_price() {
        return order_item_price;
    }

    public void setOrder_item_price(double order_item_price) {
        this.order_item_price = order_item_price;
    }
}
