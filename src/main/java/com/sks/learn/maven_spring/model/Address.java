package com.sks.learn.maven_spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean {
	private String city;
	private String state;
	private int zip;

	public Address() {

	}

	public Address(String city, String state, int zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return city + ", " + state + ", " + zip;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lifecycle Callback Method-Initialization: Address bean is initialized successfully");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Lifecycle Callback Method-Destroy: Address bean is going to be destroyed");
		
	}
}
