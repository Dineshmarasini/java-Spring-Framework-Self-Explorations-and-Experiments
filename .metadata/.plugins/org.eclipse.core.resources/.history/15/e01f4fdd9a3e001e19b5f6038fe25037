package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireAnnotation.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student);
		 

	}

}
