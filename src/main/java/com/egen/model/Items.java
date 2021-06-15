package com.egen.model;

public class Items {
    private String item_name;
    private int quantity;
    private double item_cost;

    public Items(String item_name, int quantity, double item_cost) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.item_cost = item_cost;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItem_cost() {
        return item_cost;
    }

    public void setItem_cost(double item_cost) {
        this.item_cost = item_cost;
    }
}
