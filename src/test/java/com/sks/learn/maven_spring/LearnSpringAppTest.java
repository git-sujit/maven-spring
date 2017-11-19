package com.sks.learn.maven_spring;

import org.junit.Test;

import com.sks.learn.maven_spring.concepts.SpringConcepts;

/**
 * Unit test for simple App.
 */
public class LearnSpringAppTest {

	@Test
	public void testSpringConcepts() {
		System.out.println("###################### SPRING DI ########################");
		SpringConcepts.testPolymorphism();
		SpringConcepts.testDependencyInjection();
	}

	@Test
	public void testSpringBasics() {
		System.out.println("###################### SPRING BASIC CONCEPTS ########################");
		LearnSpringApp obj = new LearnSpringApp();
		obj.beanFactoryDemo();
		obj.appContextDemo();
		obj.innerBeanDemo();
	}

	@Test
	public void validateSpringAdvance() {
		System.out.println("###################### SPRING ADVANCED CONCEPTS ########################");
		LearnSpringApp obj = new LearnSpringApp();
		obj.springInheritanceDemo();
	}
}