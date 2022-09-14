package com.jrdsystems.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Home {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Question q = new Question();
		q.setQuestion_id(1);
		q.setQuestion("What is java?");
		
		Answer a = new Answer();
		a.setAnswer_id(10);
		a.setAnswer("Java is a Programming language.");
		a.setQuestion(q);
		
		Answer a1 = new Answer();
		a1.setAnswer_id(11);
		a1.setAnswer("Java is a class-based, object-oriented programming language.");
		a1.setQuestion(q);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		
		q.setAnswer(list);
		
		session.save(q);
		session.save(a);
		session.save(a1);

		
		tx.commit();
		
		factory.close();
	}

}
