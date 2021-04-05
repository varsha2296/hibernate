package com.xworkz.tractor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tractor.dao.TractorDAO;
import com.xworkz.tractor.dto.TractorDTO;

public class Tester {

	public static void main(String[] args) {
		String contextConfigLocation = "application.xml";
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);

		TractorDAO tractorDAO = context.getBean(TractorDAO.class);
		TractorDTO tractorDTO = new TractorDTO("Kubota", 600000.0, "Orange", 34, 1600, 30);
		tractorDAO.saveTractor(tractorDTO);
	}

}
