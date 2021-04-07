package com.xworkz.fan.dao;

import org.springframework.stereotype.Component;

@Component
public class FanDAO {

	public FanDAO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
}
