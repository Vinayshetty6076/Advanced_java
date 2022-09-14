package com.jrd.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.jrd.spring.core.javaconfig")
public class JavaConfig {

	@Bean
	public Student getStudent() {

		// creating a new student object
		Student student = new Student();
		return student;
	}
}
