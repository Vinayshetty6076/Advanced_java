package com.jrdsystems.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Home1 {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Question1 q = new Question1();
		q.setQuestion_id(1);
		q.setQuestion("What is java?");
		
		Answer1 a = new Answer1(); 
		a.setAnswer_id(10);
		a.setAnswer("Java is a Programming language.");
		a.setQuestion(q);
		q.setAnswer(a);
		
		Question1 q1 = new Question1();
		q1.setQuestion_id(2);
		q1.setQuestion("What is java?");
		
		Answer1 a1 = new Answer1();
		a1.setAnswer_id(11);
		a1.setAnswer("Java is a Programming language.");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		session.save(q);
		session.save(a);
		session.save(q1);
		session.save(a1);
		
		tx.commit();
		
		factory.close();
	}

}
