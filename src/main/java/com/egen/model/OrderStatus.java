package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "order_status")
public class OrderStatus {

    @Id
    @Column(name = "order_status_id")
    private String orderStatusId;
    private String status;

    public OrderStatus() {
        this.orderStatusId = UUID.randomUUID().toString();
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "orderStatusId='" + orderStatusId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
