package com.egen.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @Column(name = "order_item_id")
    private String orderItemId;
    private String itemId;
    private int itemQuantity;
    private double itemPrice;
    private double itemTax;
    private double shippingCharges;
    private double total;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "order_status_id")
    private OrderStatus orderStatus;

    public OrderItem() {
        this.orderItemId = UUID.randomUUID().toString();
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemTax() {
        return itemTax;
    }

    public void setItemTax(double itemTax) {
        this.itemTax = itemTax;
    }

    public double getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(double shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPrice=" + itemPrice +
                ", itemTax=" + itemTax +
                ", shippingCharges=" + shippingCharges +
                ", total=" + total +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
