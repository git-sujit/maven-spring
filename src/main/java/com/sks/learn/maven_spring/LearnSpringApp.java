package com.sks.learn.maven_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.sks.learn.maven_spring.annons.AnnonCustomer;
import com.sks.learn.maven_spring.model.Address;
import com.sks.learn.maven_spring.model.Customer;

/**
 * BeanFactory Vs ApplicationContext
 *
 */
public class LearnSpringApp {

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
		Address custAddAlias = (Address) context.getBean("customerAddress-alias");
		System.out.println("Address from Alias name = " + custAddAlias);
		System.out.println("Customer = " + cust);
		// Avoid resource leak: Context never closed warning
		// Downcast your ApplicationContext to ConfigurableApplicationContext
		// which defines close() method:
		((ClassPathXmlApplicationContext) context).close();
	}

	public void innerBeanDemo() {
		System.out.println("\n***********Inner Bean Demo");
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println("Customer = " + cust);
		// Avoid resource leak: Context never closed warning
		// Downcast your ApplicationContext to ConfigurableApplicationContext
		// which defines close() method:
		((ClassPathXmlApplicationContext) context).close();
	}

	public void springInheritanceDemo() {
		System.out.println("\n***********Spring Inheritance Demo");
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context-adv.xml");
		Customer cust = (Customer) context.getBean("customer1");
		System.out.println("Customer = " + cust);
		// Avoid resource leak: Context never closed warning
		// Downcast your ApplicationContext to ConfigurableApplicationContext
		// which defines close() method:
		((ClassPathXmlApplicationContext) context).close();
	}

	public void springLifecycleCallbacks() {
		System.out.println("\n***********Spring Lifecycle Callbacks");
	}

	public void springAnnotationsDemo() {
		System.out.println("\n***********Spring Annotations Demo");
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context-annotations.xml");
		AnnonCustomer aCust = (AnnonCustomer) context.getBean("annonCustomer");
	}
}
