package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exampl {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Exampl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exampl [subject=" + subject + "]";
	}
	
      @PostConstruct
	public void init() {
		System.out.println("Init method: Example");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method: Example");
	}
}
