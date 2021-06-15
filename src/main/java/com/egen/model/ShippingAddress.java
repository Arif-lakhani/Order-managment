package com.egen.model;

import java.time.ZonedDateTime;
import java.util.UUID;

public class ShippingAddress {
	
	private String shippingId;
	
	private String shippingAddressline1;
	
	private String shippingAddressline2;
	
	private String shippingCity;
	
	private String shippingState;
	
	private String shippingZip;
	
	private ZonedDateTime shippingAddressCreatedOn;
	
	private ZonedDateTime shippingAddressModifiedOn;

	public ShippingAddress(String shippingAddressline1, String shippingAddressline2, String shippingCity,
			String shippingState, String shippingZip, ZonedDateTime shippingAddressCreatedOn,
			ZonedDateTime shippingAddressModifiedOn) {
		this.shippingId = UUID.randomUUID().toString();
		this.shippingAddressline1 = shippingAddressline1;
		this.shippingAddressline2 = shippingAddressline2;
		this.shippingCity = shippingCity;
		this.shippingState = shippingState;
		this.shippingZip = shippingZip;
		this.shippingAddressCreatedOn = shippingAddressCreatedOn;
		this.shippingAddressModifiedOn = shippingAddressModifiedOn;
	}

	public String getShippingId() {
		return shippingId;
	}

	public void setShippingId(String shippingId) {
		this.shippingId = shippingId;
	}

	public String getShippingAddressline1() {
		return shippingAddressline1;
	}

	public void setShippingAddressline1(String shippingAddressline1) {
		this.shippingAddressline1 = shippingAddressline1;
	}

	public String getShippingAddressline2() {
		return shippingAddressline2;
	}

	public void setShippingAddressline2(String shippingAddressline2) {
		this.shippingAddressline2 = shippingAddressline2;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingZip() {
		return shippingZip;
	}

	public void setShippingZip(String shippingZip) {
		this.shippingZip = shippingZip;
	}

	public ZonedDateTime getShippingAddressCreatedOn() {
		return shippingAddressCreatedOn;
	}

	public void setShippingAddressCreatedOn(ZonedDateTime shippingAddressCreatedOn) {
		this.shippingAddressCreatedOn = shippingAddressCreatedOn;
	}

	public ZonedDateTime getShippingAddressModifiedOn() {
		return shippingAddressModifiedOn;
	}

	public void setShippingAddressModifiedOn(ZonedDateTime shippingAddressModifiedOn) {
		this.shippingAddressModifiedOn = shippingAddressModifiedOn;
	}

	@Override
	public String toString() {
		return "ShippingAddress [shippingId=" + shippingId + ", shippingAddressline1=" + shippingAddressline1
				+ ", shippingAddressline2=" + shippingAddressline2 + ", shippingCity=" + shippingCity
				+ ", shippingState=" + shippingState + ", shippingZip=" + shippingZip + ", shippingAddressCreatedOn="
				+ shippingAddressCreatedOn + ", shippingAddressModifiedOn=" + shippingAddressModifiedOn + "]";
	}

}
