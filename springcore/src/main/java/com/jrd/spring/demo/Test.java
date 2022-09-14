package com.jrd.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jrd/spring/demo/newconfig.xml");
		Heloworld helo=(Heloworld) context.getBean("helo");
		helo.sayHello();
		((AbstractApplicationContext) context).close();
		
	}

}
