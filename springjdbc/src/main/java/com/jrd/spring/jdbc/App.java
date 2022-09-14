package com.jrd.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {  
	public static void main(String[] args)

	{

		System.out.println("my progarm started.....");
		// spring jdbc=> jdbc template
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jrd/spring/jdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		

		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";

		// fire the query
		int result = template.update(query, 342, "vijay rao", "bangalore");
		System.out.println("number of records inserted..." + result);

	}
}
