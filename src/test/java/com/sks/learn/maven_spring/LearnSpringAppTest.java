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

	@Test
	public void validateAnnotations() {
		System.out.println("###################### SPRING ANNOTATIONS / JSR 250 ANNOTATIONS ########################");
		LearnSpringApp obj = new LearnSpringApp();
		obj.springAnnotationsDemo();
	}

	@Test
	public void validateEventHandler() {
		System.out.println("###################### SPRING EVENT HANDLER ########################");
		LearnSpringApp obj = new LearnSpringApp();
		obj.springEventHandlerDemo();
	}
}
