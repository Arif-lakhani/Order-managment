package com.egen.model;

import java.time.ZonedDateTime;
import java.util.UUID;

public class BillingAddress {
	
	private String billingId;

	private String billingAddressline1;
	
	private String billingAddressline2;
	
	private String billingCity;
	
	private String billingState;
	
	private String billingZip;
	
	private ZonedDateTime billingAddressCreatedOn;
	
	private ZonedDateTime billingAddressModifiedOn;

	public BillingAddress(String billingAddressline1, String billingAddressline2, String billingCity,
			String billingState, String billingZip, ZonedDateTime billingAddressCreatedOn,
			ZonedDateTime billingAddressModifiedOn) {
		this.billingId = UUID.randomUUID().toString();
		this.billingAddressline1 = billingAddressline1;
		this.billingAddressline2 = billingAddressline2;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.billingZip = billingZip;
		this.billingAddressCreatedOn = billingAddressCreatedOn;
		this.billingAddressModifiedOn = billingAddressModifiedOn;
	}

	public String getBillingId() {
		return billingId;
	}

	public void setBillingId(String billingId) {
		this.billingId = billingId;
	}

	public String getBillingAddressline1() {
		return billingAddressline1;
	}

	public void setBillingAddressline1(String billingAddressline1) {
		this.billingAddressline1 = billingAddressline1;
	}

	public String getBillingAddressline2() {
		return billingAddressline2;
	}

	public void setBillingAddressline2(String billingAddressline2) {
		this.billingAddressline2 = billingAddressline2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}

	public ZonedDateTime getBillingAddressCreatedOn() {
		return billingAddressCreatedOn;
	}

	public void setBillingAddressCreatedOn(ZonedDateTime billingAddressCreatedOn) {
		this.billingAddressCreatedOn = billingAddressCreatedOn;
	}

	public ZonedDateTime getBillingAddressModifiedOn() {
		return billingAddressModifiedOn;
	}

	public void setBillingAddressModifiedOn(ZonedDateTime billingAddressModifiedOn) {
		this.billingAddressModifiedOn = billingAddressModifiedOn;
	}

	@Override
	public String toString() {
		return "BillingAddress [billingId=" + billingId + ", billingAddressline1=" + billingAddressline1
				+ ", billingAddressline2=" + billingAddressline2 + ", billingCity=" + billingCity + ", billingState="
				+ billingState + ", billingZip=" + billingZip + ", billingAddressCreatedOn=" + billingAddressCreatedOn
				+ ", billingAddressModifiedOn=" + billingAddressModifiedOn + "]";
	}

}
