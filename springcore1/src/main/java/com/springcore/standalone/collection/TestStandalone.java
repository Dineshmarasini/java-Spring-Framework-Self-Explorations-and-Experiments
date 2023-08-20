package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/StandaloneConfig.xml");
		Person person=(Person)context.getBean("person1");
		System.out.println(person);
				

	}

}
