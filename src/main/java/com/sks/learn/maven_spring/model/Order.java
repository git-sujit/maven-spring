package com.sks.learn.maven_spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements InitializingBean, DisposableBean{
	private String orderNo;
	private double orderAmount;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return orderNo + ", " + orderAmount;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lifecycle Callback Method-Initialization: Order bean is initialized successfully");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Lifecycle Callback Method-Destroy: Order bean is going to be destroyed");
	}
}
