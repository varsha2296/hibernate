package com.xworkz.bottles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String contextConfigFile = "application.xml";
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfigFile);

		Bottles bottles = applicationContext.getBean(Bottles.class);
		HashMap<String, String> bottles1 = bottles.getBottles();
		for (String i : bottles1.keySet()) {
			System.out.println("key: " + i + " value: " + bottles1.get(i));
		}

		System.out.println("*********************************");
		Colors colors = applicationContext.getBean(Colors.class);
		HashSet<String> colors1 = colors.getColors();
		for (String i : colors1) {
			System.out.println(i);
		}

		System.out.println("*********************************");
		Shapes shapes = applicationContext.getBean(Shapes.class);
		ArrayList<String> shapesList = shapes.getShapesList();
		ListIterator<String> listIterator = shapesList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}