package com.sks.learn.maven_spring.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Customer implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
	private String customerId;
	private String customerName;
	private Address address;
	private Payment payment;
	private List<Order> orderList;
	private Set<String> favColor;
	private Map<String, String> secretQuestions;
	private Properties environmentProps;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		System.out.println("$$$$$Setting payment: " + payment);
		this.payment = payment;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public Set<String> getFavColor() {
		return favColor;
	}

	public void setFavColor(Set<String> favColor) {
		this.favColor = favColor;
	}

	public Map<String, String> getSecretQuestions() {
		return secretQuestions;
	}

	public void setSecretQuestions(Map<String, String> secretQuestions) {
		this.secretQuestions = secretQuestions;
	}

	public Properties getEnvironmentProps() {
		return environmentProps;
	}

	public void setEnvironmentProps(Properties environmentProps) {
		this.environmentProps = environmentProps;
	}

	@Override
	public String toString() {
		return customerId + ":" + customerName + ", Address=" + address + ", Payment=" + payment + ", OrderList=["
				+ printOrderList() + "]" + ", Favorite Colors = [" + printFavColors() + "]" + ", Secret Questions = ["
				+ printSecretQuestions() + "]" + ", Environments = [" + printEnvProperties() + "]";
	}

	private String printOrderList() {
		StringBuilder sb = new StringBuilder();
		if (orderList != null) {
			orderList.forEach(
					order -> sb.append("  Order=(" + order.getOrderNo() + ", " + order.getOrderAmount() + ")"));
		}
		return sb.toString();
	}

	private String printFavColors() {
		StringBuilder sb = new StringBuilder();
		if (favColor != null) {
			favColor.forEach(color -> sb.append(color + " "));
		}
		return sb.toString();
	}

	private String printSecretQuestions() {
		StringBuilder sb = new StringBuilder();
		if (secretQuestions != null) {
			secretQuestions.forEach((k, v) -> sb.append(" " + k + ":" + v));
		}
		return sb.toString();
	}

	private String printEnvProperties() {
		StringBuilder sb = new StringBuilder();
		if (environmentProps != null) {
			environmentProps.forEach((k, v) -> sb.append(" " + k + ":" + v));
		}
		return sb.toString();
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("Bean Name = " + arg0);

	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("app name = " + arg0.getApplicationName());
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lifecycle Callback Method: Customer bean is initialized successfully");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Lifecycle Callback Method: Customer bean is going to be destroyed");
	}
}
