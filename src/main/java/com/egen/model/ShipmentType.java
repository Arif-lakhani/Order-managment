package com.egen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.UUID;

@Entity
public class ShipmentType {
    @Id
    @Column(name="shipment_id")
    private String shipmentId;
    private String shipmentType;

    public ShipmentType() {
        this.shipmentId = UUID.randomUUID().toString();
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    @Override
    public String toString() {
        return "ShipmentType{" +
                "shipmentId='" + shipmentId + '\'' +
                ", shipmentType='" + shipmentType + '\'' +
                '}';
    }
}
