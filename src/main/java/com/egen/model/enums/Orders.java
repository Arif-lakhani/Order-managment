package com.egen.model.enums;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name="Orders.getAllOrders",query = "SELECT ord FROM Orders ord"),
        @NamedQuery(name="Orders.getOrderById", query="SELECT ord FROM Orders ord WHERE ord.order_id =:paramId"),
        @NamedQuery(name="Order.getAllOrdersWithInInterval", query = "SELECT ord FROM Orders ord WHERE ord.order_created_date BETWEEN :paramstart AND :paramend"),
        @NamedQuery(name ="Order.top10OrdersWithHighestDollarAmountInZip", query = "SELECT ord FROM Orders ord JOIN Address ON ord.shippingAddress = Address.address_id " +
                "WHERE Address.order_zip =: paramzip ORDER BY ord.order_total")
})
public class Orders {

    @Id
    private String order_id;

    private String customer_id;
    private Double order_sub_total;
    private Double order_total;
    private Double order_tax;
    private Timestamp order_date;
    private Timestamp order_created_date;
    private Timestamp order_modified_date;

    @Column(name="order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Column(name="shipment_type")
    @Enumerated(EnumType.STRING)
    private ShippingType shipmentType;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, targetEntity = OrderItems.class, mappedBy = "orders")
    private List<OrderItems> orderItemsList = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, targetEntity = Payment.class, mappedBy = "orders")
    private List<Payment> paymentDetail = new ArrayList<>();

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "billing_address_id")
    private Address billingAddress;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "shipping_address_id")
    private Address shippingAddress;

    public Orders(){
        this.order_id = UUID.randomUUID().toString();
    }
    public Orders(String customer_id, Double order_sub_total, Double order_total, Double order_tax, Timestamp order_date, Timestamp order_created_date, Timestamp order_modified_date, OrderStatus orderStatus, ShippingType shipmentType, List<OrderItems> orderItemsList, List<Payment> paymentDetail, Address billingAddress, Address shippingAddress) {
        this.customer_id = customer_id;
        this.order_sub_total = order_sub_total;
        this.order_total = order_total;
        this.order_tax = order_tax;
        this.order_date = order_date;
        this.order_created_date = order_created_date;
        this.order_modified_date = order_modified_date;
        this.orderStatus = orderStatus;
        this.shipmentType = shipmentType;
        this.orderItemsList = orderItemsList;
        this.paymentDetail = paymentDetail;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public Double getOrder_sub_total() {
        return order_sub_total;
    }

    public void setOrder_sub_total(Double order_sub_total) {
        this.order_sub_total = order_sub_total;
    }

    public Double getOrder_total() {
        return order_total;
    }

    public void setOrder_total(Double order_total) {
        this.order_total = order_total;
    }

    public Double getOrder_tax() {
        return order_tax;
    }

    public void setOrder_tax(Double order_tax) {
        this.order_tax = order_tax;
    }

    public Timestamp getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Timestamp order_date) {
        this.order_date = order_date;
    }

    public Timestamp getOrder_created_date() {
        return order_created_date;
    }

    public void setOrder_created_date(Timestamp order_created_date) {
        this.order_created_date = order_created_date;
    }

    public Timestamp getOrder_modified_date() {
        return order_modified_date;
    }

    public void setOrder_modified_date(Timestamp order_modified_date) {
        this.order_modified_date = order_modified_date;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShippingType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShippingType shipmentType) {
        this.shipmentType = shipmentType;
    }

    public List<Payment> getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(List<Payment> paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id='" + order_id + '\'' +
                ", customer_id='" + customer_id + '\'' +
                ", order_sub_total=" + order_sub_total +
                ", order_total=" + order_total +
                ", order_tax=" + order_tax +
                ", order_date=" + order_date +
                ", order_created_date=" + order_created_date +
                ", order_modified_date=" + order_modified_date +
                ", orderStatus=" + orderStatus +
                ", shipmentType=" + shipmentType +
                ", orderItemsList=" + orderItemsList +
                ", paymentDetail=" + paymentDetail +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}
