package com.sks.learn.maven_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sks.learn.maven_spring.model.Customer;

/**
 * BeanFactory Vs ApplicationContext
 *
 */
public class App {
	public static void main(String[] args) {
		App obj = new App();
		obj.beanFactoryDemo();
		obj.beanFactoryDemo();
	}

	public void beanFactoryDemo() {
		System.out.println("\n***********Creating java objects using BeanFactory");
		// Using BeanFactory
		// Check the location of beans.xml, directly under project
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Customer cust1 = (Customer) factory.getBean("customer");
		System.out.println(cust1);
	}

	public void appContextDemo() {
		System.out.println("\n***********Creating java objects using Application Context");
		// Using Application Context : Superset of BeanFactory
		// Bean Config XML should be in classpath: look into .classpath
		// e.g: app-context should be in src/main/java
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println("Customer = " + cust);
	}
}
