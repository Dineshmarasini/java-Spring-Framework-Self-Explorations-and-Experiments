package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Autowired 
	@Qualifier("p2")
	private Person p1;
	 
	public Person getP1() {
		return p1;
	}
	
	public void setP1(Person p1) {
		System.out.println("setting value");
		this.p1 = p1;
	}
	
	public Student(Person p1) {
		super();
		this.p1 = p1;
		System.out.println("inside constructor.....");
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
	@Override
	public String toString() {
		 
		return  "Studnet[ person: "+p1+" ]";
	}

}
