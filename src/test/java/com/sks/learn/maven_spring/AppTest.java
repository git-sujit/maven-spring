package com.sks.learn.maven_spring;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testSpringBasics(){
		App obj = new App();
		obj.beanFactoryDemo();
		obj.appContextDemo();
	}
}

