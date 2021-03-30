package com.xworkz.headphone;

public class Headphone {

	private String brand;
	private double price;
	private String color;

	public Headphone(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void listenToMusic() {
		System.out.println("invoked listen to music");
	}

	public void attendCall() {
		System.out.println("invoked attend call");
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
}
