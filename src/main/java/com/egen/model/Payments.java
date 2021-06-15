package com.egen.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "payment")
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private String paymentId;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "payment_confirmation_number")
    private String paymentConfirmationNumber;
    @Column(name = "payment_amount")
    private Double paymentAmount;
    @Column(name = "payment_card_number")
    private String paymentCardNumber;
    @Column(name = "payment_card_cvv")
    private String paymentCardCVV;

    public Payments(){
        this.paymentId = UUID.randomUUID().toString();
    }
    public Payments(String paymentId, String paymentMethod, Date paymentDate,
                    String paymentConfirmationNumber, Double paymentAmount,
                    String paymentCardNumber, String paymentCardCVV) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.paymentConfirmationNumber = paymentConfirmationNumber;
        this.paymentAmount = paymentAmount;
        this.paymentCardNumber = paymentCardNumber;
        this.paymentCardCVV = paymentCardCVV;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentConfirmationNumber() {
        return paymentConfirmationNumber;
    }

    public void setPaymentConfirmationNumber(String paymentConfirmationNumber) {
        this.paymentConfirmationNumber = paymentConfirmationNumber;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentCardNumber() {
        return paymentCardNumber;
    }

    public void setPaymentCardNumber(String paymentCardNumber) {
        this.paymentCardNumber = paymentCardNumber;
    }

    public String getPaymentCardCVV() {
        return paymentCardCVV;
    }

    public void setPaymentCardCVV(String paymentCardCVV) {
        this.paymentCardCVV = paymentCardCVV;
    }
}
