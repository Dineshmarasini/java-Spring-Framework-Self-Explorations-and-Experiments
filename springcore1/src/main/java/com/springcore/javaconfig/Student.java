package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

 

 
public class Student {
	private Samos samosa; 
	
	public Student(Samos samosa) {
		super();
		this.samosa = samosa;
	}

	public Samos getSamosa() {
		return samosa;
	}

	public void setSamosa(Samos samosa) {
		this.samosa = samosa;
	}

	public void study() {
		samosa.displayPrice();
		System.out.println("student is reading book: ");
	}

}
