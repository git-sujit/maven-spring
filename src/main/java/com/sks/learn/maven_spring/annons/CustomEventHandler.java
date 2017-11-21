package com.sks.learn.maven_spring.annons;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventHandler implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println("Event Handler Name = " + arg0.toString());
	}

}
