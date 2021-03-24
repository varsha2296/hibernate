package com.xworkz.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTester {

	public static void main(String[] args) {

		// start framework
		String stringXml = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(stringXml);

		// to get the object
		Mobile mobile = container.getBean(Mobile.class);
		mobile.onAndOff();
		mobile.charging();
		mobile.call();

	}

}
