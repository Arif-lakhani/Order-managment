package com.egen.util;

import com.egen.enums.ShipmentMethod;
import com.egen.model.Address;
import com.egen.model.Item;
import com.egen.model.Payment;

import java.util.List;

public class InputData {

    private Long customer_id;
    private List<Item> items;
    private Address shippingAddress;
    private Address billingAddress;
    private List<Payment> payments;
    private ShipmentMethod shipmentMethod;

    public InputData() {
    }

    public InputData(Long customer_id, List<Item> items, Address shippingAddress, Address billingAddress, List<Payment> payments, ShipmentMethod shipmentMethod) {
        this.customer_id = customer_id;
        this.items = items;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.payments = payments;
        this.shipmentMethod = shipmentMethod;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public ShipmentMethod getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(ShipmentMethod shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "customer_id=" + customer_id +
                ", items=" + items +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", payments=" + payments +
                ", shipmentMethod=" + shipmentMethod +
                '}';
    }
}
