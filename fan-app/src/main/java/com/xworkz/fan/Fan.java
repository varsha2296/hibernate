package com.xworkz.fan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fan {

	// @Value("Blue")
	private String color;

	// @Value("Small")
	private String size;

	/*public Fan() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}*/

	public Fan(@Value("Black") String color, @Value("Medium") String size) {
		super();
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	// @Value("White")
	public void setColor(String color) {
		this.color = color;
	}

	// @Value("Large")
	public void setSize(String size) {
		this.size = size;
	}

}
