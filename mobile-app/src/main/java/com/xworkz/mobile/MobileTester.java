package com.xworkz.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTester {

	public static void main(String[] args) {

		// start framework
		String stringXml = "spring.xml";
		@SuppressWarnings("resource")
		ApplicationContext container = new ClassPathXmlApplicationContext(stringXml);

		// to get the object
		Mobile mobile = container.getBean(Mobile.class);
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getColor());

		Boolean booleanType = container.getBean(Boolean.class);
		System.out.println("Boolean:" + booleanType);

		Character character = container.getBean(Character.class);
		System.out.println("Character:" + character);

		Byte byteType = container.getBean(Byte.class);
		System.out.println("Byte:" + byteType);

		Short shortType = container.getBean(Short.class);
		System.out.println("Short:" + shortType);

		Integer integer = container.getBean(Integer.class);
		System.out.println("Integer:" + integer);

		Long longType = container.getBean(Long.class);
		System.out.println("Long:" + longType);

		Float floatType = container.getBean(Float.class);
		System.out.println("Float:" + floatType);

		Double doubleType = container.getBean(Double.class);
		System.out.println("Double:" + doubleType);

	}

}
