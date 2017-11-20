package com.sks.learn.maven_spring.annons;

import org.springframework.stereotype.Component;

@Component
public class AnnonCustomer {
	private String customerId;
	private String customerName;

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

}
