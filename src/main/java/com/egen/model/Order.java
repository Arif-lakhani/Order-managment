package com.egen.model;

import java.util.Date;

public class Order {
    private  String id;
    public Date createdDate;
    public Date modifiedDate;
    public String OrderStatus;
    public String Returnpolicy;

    public Order(Date createdDate, Date modifiedDate, String orderStatus, String returnpolicy) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        OrderStatus = orderStatus;
        Returnpolicy = returnpolicy;
    }

    public Order(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setOrderStatus(String orderStatus) {
        OrderStatus = orderStatus;
    }

    public void setReturnpolicy(String returnpolicy) {
        Returnpolicy = returnpolicy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public String getReturnpolicy() {
        return Returnpolicy;
    }
}
