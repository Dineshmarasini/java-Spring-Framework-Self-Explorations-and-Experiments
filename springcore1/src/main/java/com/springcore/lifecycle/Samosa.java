package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price:samosa ");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	} 
	
	public void init() {
		System.out.println("Inside the init method: samosa ");
	}
	
	public void destroy() {
		System.out.println("this is destroy method: samosa ");
	}
	
	


}
