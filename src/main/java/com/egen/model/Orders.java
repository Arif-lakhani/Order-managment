package com.egen.model;

import com.egen.enums.OrderStatus;
import com.egen.enums.ShipmentMethod;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name = "Orders.findAll",query = "SELECT ord from Orders ord"),
        @NamedQuery(name = "Orders.findOne",query = "SELECT ord from Orders ord WHERE ord.id=:paramOrderId")
})
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name="date_ordered")
    private Timestamp dateOrdered;

    @Column(name = "expected_delivery")
    private Timestamp expectedDelivery;

    @Column(name = "item_quantity")
    private int itemQuantity;

    @Column(name="sub_total")
    private double subTotal;

    @Column(name = "tax")
    private double tax;

    @Column(name="shipping_charges")
    private double shippingCharges;

    @Column(name = "total")
    private double total;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name="shipment_method")
    @Enumerated(EnumType.STRING)
    private ShipmentMethod shipmentMethod;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ship_id")
    private Address shippingAddress;

    @OneToMany(mappedBy = "orders",targetEntity = Item.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Item> items = new HashSet<Item>();

    @OneToMany(mappedBy = "orders",targetEntity = Payment.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Payment> paymentDetails = new HashSet<Payment>();

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Timestamp getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Timestamp dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Timestamp getExpectedDelivery() {
        return expectedDelivery;
    }

    public void setExpectedDelivery(Timestamp expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
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

    public ShipmentMethod getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(ShipmentMethod shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<Payment> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(Set<Payment> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", dateOrdered=" + dateOrdered +
                ", expectedDelivery=" + expectedDelivery +
                ", itemQuantity=" + itemQuantity +
                ", subTotal=" + subTotal +
                ", tax=" + tax +
                ", shippingCharges=" + shippingCharges +
                ", total=" + total +
                ", orderStatus=" + orderStatus +
                ", shipmentMethod=" + shipmentMethod +
                ", shippingAddress=" + shippingAddress +
                ", items=" + items +
                ", paymentDetails=" + paymentDetails +
                '}';
    }
}
