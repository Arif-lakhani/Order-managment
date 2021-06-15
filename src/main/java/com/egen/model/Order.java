package com.egen.model;

import java.util.Date;
import java.util.List;
import com.egen.model.enums.OrderStatus;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class Order {

    @Id
    private String order_id;
    private String order_customer_id;
    private Double order_sub_total;
    private Double order_total;
    private Double order_tax;
    private Timestamp order_date;
    private Timestamp order_created_date;
    private Timestamp order_modified_date;

    @Column(name="order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public Order(String order_id){
        this.order_id = UUID.randomUUID().toString();
        this.order_date = new Timestamp(new Date().getTime());
//        this.orderStatus = OrderStatus.PENDING;
    }

    public Order() {
    }

    @OneToMany
    private List<OrderItems> orderItemsList;

    @OneToMany
    private List<Payment> payments;

    @OneToOne
    private Shipping shipping;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_customer_id() {
        return order_customer_id;
    }

    public void setOrder_customer_id(String order_customer_id) {
        this.order_customer_id = order_customer_id;
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
    //    private  String id;
//
//    public Order(String id){
//        this.id = id;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
}
