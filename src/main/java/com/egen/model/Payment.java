package com.egen.model;

import java.time.ZonedDateTime;
import java.util.UUID;

import com.egen.enums.PaymentMethod;
import com.egen.enums.PaymentProcessed;

public class Payment {
	
	private String paymentId;
	
	private PaymentMethod paymentMethod;
	
	private String paymentConfirmationNumber;
	
	private PaymentProcessed paymentProcessed;
	
	private ZonedDateTime paymentMadeOn;
	
	private ZonedDateTime paymentCreatedOn;

	public Payment(PaymentMethod paymentMethod, String paymentConfirmationNumber, PaymentProcessed paymentProcessed,
			ZonedDateTime paymentMadeOn, ZonedDateTime paymentCreatedOn) {
		this.paymentId = UUID.randomUUID().toString();
		this.paymentMethod = paymentMethod;
		this.paymentConfirmationNumber = paymentConfirmationNumber;
		this.paymentProcessed = paymentProcessed;
		this.paymentMadeOn = paymentMadeOn;
		this.paymentCreatedOn = paymentCreatedOn;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentConfirmationNumber() {
		return paymentConfirmationNumber;
	}

	public void setPaymentConfirmationNumber(String paymentConfirmationNumber) {
		this.paymentConfirmationNumber = paymentConfirmationNumber;
	}

	public PaymentProcessed getPaymentProcessed() {
		return paymentProcessed;
	}

	public void setPaymentProcessed(PaymentProcessed paymentProcessed) {
		this.paymentProcessed = paymentProcessed;
	}

	public ZonedDateTime getPaymentMadeOn() {
		return paymentMadeOn;
	}

	public void setPaymentMadeOn(ZonedDateTime paymentMadeOn) {
		this.paymentMadeOn = paymentMadeOn;
	}

	public ZonedDateTime getPaymentCreatedDate() {
		return paymentCreatedOn;
	}

	public void setPaymentCreatedDate(ZonedDateTime paymentCreatedOn) {
		this.paymentCreatedOn = paymentCreatedOn;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMethod=" + paymentMethod + ", paymentConfirmationNumber="
				+ paymentConfirmationNumber + ", paymentProcessed=" + paymentProcessed + ", paymentMadeOn="
				+ paymentMadeOn + ", paymentCreatedOn=" + paymentCreatedOn + "]";
	}
	
}
