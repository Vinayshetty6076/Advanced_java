package com.jrd.spring.core.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jrd/spring/core/ci/constructorconfig.xml");
		
		Person p=(Person) context.getBean("person");
		
		System.out.println(p);
		
		
		 Adition add=(Adition) context.getBean("add");
		 add.doSum();
	}
	

}
