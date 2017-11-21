package com.sks.learn.maven_spring.annons;

import org.springframework.stereotype.Component;

@Component
public class AnnonCustomer {
	private String customerId;
	private String customerName;
	private AnnonAddress address;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public AnnonAddress getAddress() {
		return address;
	}

	public void setAddress(AnnonAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return customerId + ":" + customerName + ", Address=" + address;
	}
}
