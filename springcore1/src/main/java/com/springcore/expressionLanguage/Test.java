package com.springcore.expressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/expressionlanguage/spELConfig.xml");
		Demo demo=context.getBean("demo",Demo.class);
		System.out.println(demo);
		 

	}

}
