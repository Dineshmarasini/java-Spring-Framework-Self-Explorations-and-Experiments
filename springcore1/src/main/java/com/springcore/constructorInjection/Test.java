package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorInjection/consConfig.xml");
		Person p1=(Person) context.getBean("person");
//		System.out.println(p1);
		
		Addition add1=(Addition)context.getBean("sumResult");
		add1.doSum();
		 
	}

}
