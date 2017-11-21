package com.sks.learn.maven_spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomAOP {
	@Before("execution(private String printOrderList())")
	public void loggingAdvice() {
		System.out.println("Run logging advice");
	}
}
