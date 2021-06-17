package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "Order_Item")
public class OrderItem {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String order_item_id;

    @Column(name = "order_item_name")
    private String order_item_name;

    @Column(name = "order_item_qty")
    private int order_item_qty;

    @Column(name = "order_item_price")
    private double order_item_price;

    public OrderItem(){
        this.order_item_id = UUID.randomUUID().toString();
    }

    public OrderItem(String order_id, String order_item_name, int order_item_qty, double order_item_price) {
        this.order_item_id = order_item_id;
        this.order_item_name = order_item_name;
        this.order_item_qty = order_item_qty;
        this.order_item_price = order_item_price;
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
