package com.xworkz.fan.dto;

import org.springframework.stereotype.Component;

@Component
public class FanDTO {

	public FanDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
}
