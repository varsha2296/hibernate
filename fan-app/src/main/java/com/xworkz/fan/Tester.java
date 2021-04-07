package com.xworkz.fan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		String contextConfigLocation = "application.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);
		Fan fan = context.getBean(Fan.class);
		System.out.println(fan.getColor());
		System.out.println(fan.getSize());
	}

}
