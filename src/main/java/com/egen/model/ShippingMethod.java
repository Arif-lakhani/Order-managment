package com.egen.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShippingMethod {

    @Id // UPS, FedEx
    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
