package com.jrd.spring.core.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 public static void main(String[] args)
	 {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jrd/spring/core/auto/wire/annotations/autoannotationconfig.xml");
		 
		 
		 Student stud1= context.getBean("stud1",Student.class);
		 System.out.println(stud1);
	 }
	 

}
