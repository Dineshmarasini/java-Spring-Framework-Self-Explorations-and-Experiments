package com.springcore.lifecycle;

import java.security.PublicKey;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
//		Samosa s=(Samosa)context.getBean("samosa1");
//		System.out.println(s);
//		
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		
//		Pepsi p=(Pepsi)context.getBean("pepsi");
//		System.out.println(p);
//		
//		context.registerShutdownHook();
//	
	   
		Exampl exampl=(Exampl)context.getBean("annotation");
		System.out.println(exampl);
	

	}

}
