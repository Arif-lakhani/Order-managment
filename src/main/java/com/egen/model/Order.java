package com.egen.model;

import com.egen.enums.DeliveryMethod;
import com.egen.enums.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "ORDER")
@NamedQueries({
        @NamedQuery(name="Order.getAllOrders", query = "SELECT ord FROM Order ord"),
        @NamedQuery(name="Order.getOrderById", query = "SELECT ord FROM Order ord WHERE ord.id =:paramId"),
        @NamedQuery(name="Order.getAllOrdersWithInInterval", query = "SELECT ord FROM Order ord WHERE ord.creadtedDate BETWEEN :paramstart AND :paramend"),
        @NamedQuery(name ="Order.top10OrdersWithHighestDollarAmountInZip", query = "SELECT ord FROM Order ord JOIN Address ON ord.shippingAddressId = Address.id " +
                "WHERE Address.zip =: paramzip ORDER BY ord.total")

})
public class Order {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private  String id;

    @ManyToOne
    private Address shippingAddressId;

    @ManyToOne
    private Address billingAddressId;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<Payment> payment;

    @OneToMany
    private List<OrderItem> orderItems;

    private Date creadtedDate;

    private Date modifiedDate;

    private Date orderDeliveredDate;

    private OrderStatus orderStatus;

    private int subTotal;

    private int tax;

    private int shipping_Charges;

    private int total;

    private DeliveryMethod orderDeliveryMethod;

    public Order() {
        this.id = UUID.randomUUID().toString();
    }

    public Order(String id){
        this.id = UUID.randomUUID().toString();
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Address getShippingAddress() {
        return shippingAddressId;
    }

    public void setShippingAddress(Address shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public Address getBillingAddress() {
        return billingAddressId;
    }

    public void setBillingAddress(Address billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreadtedDate() {
        return creadtedDate;
    }

    public void setCreadtedDate(Date creadtedDate) {
        this.creadtedDate = creadtedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getOrderDeliveredDate() {
        return orderDeliveredDate;
    }

    public void setOrderDeliveredDate(Date orderDeliveredDate) {
        this.orderDeliveredDate = orderDeliveredDate;
    }

    public DeliveryMethod getOrderDeliveryMethod() {
        return orderDeliveryMethod;
    }

    public void setOrderDeliveryMethod(DeliveryMethod orderDeliveryMethod) {
        this.orderDeliveryMethod = orderDeliveryMethod;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getShipping_Charges() {
        return shipping_Charges;
    }

    public void setShipping_Charges(int shipping_Charges) {
        this.shipping_Charges = shipping_Charges;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
