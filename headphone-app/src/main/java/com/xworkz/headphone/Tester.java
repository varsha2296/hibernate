package com.xworkz.headphone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String contextConfiguration = "application.xml";
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfiguration);

		Headphone headphone = applicationContext.getBean(Headphone.class);
		System.out.println(headphone.getBrand());
		System.out.println(headphone.getPrice());
		System.out.println(headphone.getColor());
	}

}
