package com.egen.util;

import com.egen.enums.ShipmentMethod;
import com.egen.model.Address;
import com.egen.model.Payment;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to fetch the input Json object and create a new order
 */
public class InputData {

    private Long customer_id;
    private int[] items;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean billingSameAsShippingAddress;
    private List<Payment> payments;
    private ShipmentMethod shipmentMethod;
    private int itemQuantity;

    public InputData() {
    }

    public InputData(Long customer_id, int[] items, Address shippingAddress, Address billingAddress,
                     boolean billingSameAsShippingAddress, List<Payment> payments, ShipmentMethod shipmentMethod,
                     int itemQuantity) {
        this.customer_id = customer_id;
        this.items = items;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.billingSameAsShippingAddress = billingSameAsShippingAddress;
        this.payments = payments;
        this.shipmentMethod = shipmentMethod;
        this.itemQuantity = itemQuantity;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public int[] getItems() { return items; }

    public void setItems(int[] items) { this.items = items; }

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

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public boolean isBillingSameAsShippingAddress() {
        return billingSameAsShippingAddress;
    }

    public void setBillingSameAsShippingAddress(boolean billingSameAsShippingAddress) {
        this.billingSameAsShippingAddress = billingSameAsShippingAddress;
    }

    @Override
    public String toString() {
        return "InputData{" +
                "customer_id=" + customer_id +
                ", items=" + Arrays.toString(items) +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", billingSameAsShippingAddress=" + billingSameAsShippingAddress +
                ", payments=" + payments +
                ", shipmentMethod=" + shipmentMethod +
                ", itemQuantity=" + itemQuantity +
                '}';
    }
}
