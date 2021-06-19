package com.egen.model;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private  String orderid;
    @Column(name = "customer_id")
    private String customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "status")
    private String status;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "modified_date")
    private Date modifiedDate;
    @Column(name = "notes")
    private String notes;
    @Column(name = "order_shipping_charges")
    private double orderShippingCharges;
    @Column(name = "order_subtotal")
    private double orderSubtotal;
    @Column(name = "order_total")
    private double orderTotal;
    @Column(name = "order_tax")
    private double orderTax;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Payments> payments;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private BillingDetails billingDetails;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private ShippingDetails shippingDetails;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Item> items;

    public Order(){
        System.out.println("order constructor");
        this.orderid = UUID.randomUUID().toString();
        this.createdDate = new Timestamp(new  Date().getTime());
    }

    public Order(String orderid, String customerId, String customerName, String customerEmail, String status,
                 Date createdDate, Date modifiedDate, String notes, double orderShippingCharges,
                 double orderSubtotal, double orderTotal, double orderTax,
                 List<Payments> payments, BillingDetails billingDetails, ShippingDetails shippingDetails,
                 List<Item> items) {
        this.orderid = orderid;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.notes = notes;
        this.orderShippingCharges = orderShippingCharges;
        this.orderSubtotal = orderSubtotal;
        this.orderTotal = orderTotal;
        this.orderTax = orderTax;
        this.payments = payments;
        this.billingDetails = billingDetails;
        this.shippingDetails = shippingDetails;
        this.items = items;
    }

    public Order(String orderid){
        this.orderid = orderid;
    }

    public String getId() {
        return orderid;
    }

    public void setId(String id) {
        this.orderid = orderid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getOrderShippingCharges() {
        return orderShippingCharges;
    }

    public void setOrderShippingCharges(double orderShippingCharges) {
        this.orderShippingCharges = orderShippingCharges;
    }

    public double getOrderSubtotal() {
        return orderSubtotal;
    }

    public void setOrderSubtotal(double orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public double getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(double orderTax) {
        this.orderTax = orderTax;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }

    public BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(BillingDetails billingDetails) {
        this.billingDetails = billingDetails;
    }

    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", status='" + status + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", notes='" + notes + '\'' +
                ", orderShippingCharges=" + orderShippingCharges +
                ", orderSubtotal=" + orderSubtotal +
                ", orderTotal=" + orderTotal +
                ", orderTax=" + orderTax +
                ", payments=" + payments +
                ", billingDetails=" + billingDetails +
                ", shippingDetails=" + shippingDetails +
                ", items=" + items +
                '}';
    }
}
