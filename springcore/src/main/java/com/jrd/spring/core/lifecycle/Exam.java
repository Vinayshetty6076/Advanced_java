package com.jrd.spring.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + "]";
	}
    
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}

	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}

}
