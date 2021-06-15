package com.egen.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @Column(name = "order_item_id",nullable = false)
    private String orderItemId;
    private int itemQuantity;
    private double itemPrice;
    private double itemTax;
    private double shippingCharges;
    private double total;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "item_id")
    private List<Item> item;

    @OneToOne(cascade={CascadeType.ALL})
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

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPrice=" + itemPrice +
                ", itemTax=" + itemTax +
                ", shippingCharges=" + shippingCharges +
                ", total=" + total +
                ", item=" + item +
                ", orderStatus=" + orderStatus +
                '}';
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
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

}
