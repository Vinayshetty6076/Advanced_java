package com.jrd.spring.core.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jrd/spring/core/spel/spelconfig.xml");
		
		Demo d1= context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
//		SpelExpressionParser temp =new SpelExpressionParser();  //using APIs
//		Expression expression = temp.parseExpression("22+44"); 
//		System.out.println(expression.getValue());
//		

	}

}
