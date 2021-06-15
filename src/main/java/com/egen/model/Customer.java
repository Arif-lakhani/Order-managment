package com.egen.model;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import com.egen.enums.Gender;

public class Customer {
	
	private String customerId;
	
	private String customerFirstName;
	
	private String customerLastName;
	
	private Gender customerGender;
	
	private String customerEmail;
	
	private String customerPhoneNumber;
	
	private List<String> customerBillingIds;
	
	private List<String> customerShippingIds;
	
	private ZonedDateTime customerCreatedOn;
	
	private ZonedDateTime customerModifiedOn;

	public Customer(String customerFirstName, String customerLastName, Gender customerGender, String customerEmail,
			String customerPhoneNumber, List<String> customerBillingIds, List<String> customerShippingIds,
			ZonedDateTime customerCreatedOn, ZonedDateTime customerModifiedOn) {
		this.customerId = UUID.randomUUID().toString();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerGender = customerGender;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerBillingIds = customerBillingIds;
		this.customerShippingIds = customerShippingIds;
		this.customerCreatedOn = customerCreatedOn;
		this.customerModifiedOn = customerModifiedOn;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public Gender getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(Gender customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public List<String> getCustomerBillingIds() {
		return customerBillingIds;
	}

	public void setCustomerBillingIds(List<String> customerBillingIds) {
		this.customerBillingIds = customerBillingIds;
	}

	public List<String> getCustomerShippingIds() {
		return customerShippingIds;
	}

	public void setCustomerShippingIds(List<String> customerShippingIds) {
		this.customerShippingIds = customerShippingIds;
	}

	public ZonedDateTime getCustomerCreatedOn() {
		return customerCreatedOn;
	}

	public void setCustomerCreatedOn(ZonedDateTime customerCreatedOn) {
		this.customerCreatedOn = customerCreatedOn;
	}

	public ZonedDateTime getCustomerModifiedOn() {
		return customerModifiedOn;
	}

	public void setCustomerModifiedOn(ZonedDateTime customerModifiedOn) {
		this.customerModifiedOn = customerModifiedOn;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerGender=" + customerGender + ", customerEmail=" + customerEmail
				+ ", customerPhoneNumber=" + customerPhoneNumber + ", customerBillingIds=" + customerBillingIds
				+ ", customerShippingIds=" + customerShippingIds + ", customerCreatedOn=" + customerCreatedOn
				+ ", customerModifiedOn=" + customerModifiedOn + "]";
	}

}
