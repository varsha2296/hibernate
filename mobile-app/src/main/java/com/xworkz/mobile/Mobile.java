package com.xworkz.mobile;

public class Mobile {

	public Mobile() {
		super();
		System.out.println(this.getClass().getSimpleName() + " :object created");
	}

	public void onAndOff() {
		System.out.println("invoked on and off method");
	}

	public void charging() {
		System.out.println("invoked charging method");
	}

	public void call() {
		System.out.println("invoked call method");
	}
}
