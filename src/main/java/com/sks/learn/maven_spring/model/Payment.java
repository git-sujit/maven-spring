package com.sks.learn.maven_spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Payment implements InitializingBean, DisposableBean {
	private String paymentId;
	private double paymentAmount;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@Override
	public String toString() {
		return paymentId + ", " + paymentAmount;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lifecycle Callback Method-Initialization: Payment bean is initialized successfully");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Lifecycle Callback Method-Destroy: Payment bean is going to be destroyed");
	}

	public void customInit() {
		System.out.println("Payment Bean: Custom Init method");
	}

	public void customDestroy() {
		System.out.println("Payment Bean: Custom Destroy method");
	}
}
