package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Shipment {

    @Id
    @Column(name="shipment_id",nullable = false)
    private String shipmentId;
    private String shipmentMethod;

    public Shipment() {
        this.shipmentId = UUID.randomUUID().toString();
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentType() {
        return shipmentMethod;
    }

    public void setShipmentType(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    @Override
    public String toString() {
        return "ShipmentType{" +
                "shipmentId='" + shipmentId + '\'' +
                ", shipmentType='" + shipmentMethod + '\'' +
                '}';
    }
}
