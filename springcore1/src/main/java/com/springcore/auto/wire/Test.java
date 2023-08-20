package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireConfig.xml");
		Employee emp1=(Employee)context.getBean("employee");
		System.out.println(emp1.getAddress());
		
	}

}
