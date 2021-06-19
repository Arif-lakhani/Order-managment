package com.egen.model;


import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_qty")
    private int itemQty;

    @Column(name = "item_price")
    private int itemPrice;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Item(){
        this.itemId = UUID.randomUUID().toString();
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemQty=" + itemQty +
                ", itemPrice=" + itemPrice +
                ", order=" + order +
                '}';
    }
}
