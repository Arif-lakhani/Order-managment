package com.egen.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_price")
    private double itemPrice;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Orders orders;

    public Item() {

    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantityInStock=" + quantityInStock +
                ", orders=" + orders +
                '}';
    }
}
