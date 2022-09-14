package com.jrd.spring.core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

       AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/jrd/spring/core/lifecycle/lifecycleconfig.xml");
       //registering shutdown hook
       context.registerShutdownHook();
       //Samosa sam=(Samosa) context.getBean("sam"); 
       //System.out.println(sam);
       
       
       //System.out.println("+++++++++++++++++++++++++++");
       
       //Pepsi p1=(Pepsi) context.getBean("p1");
       //System.out.println(p1);
       
       Exam exam=(Exam) context.getBean("exam");
       
       System.out.println(exam);
      
	}

}
