package com.jrdsystems.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jrdsystems.Profile;

public class SecondLevelCache {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Profile profile = session.get(Profile.class, 1);
		System.out.println(profile);
		System.out.println("\nPerson details displayed successfully.\n");		
		
		session.close();
		Session session2 = factory.openSession();
		
		Profile profile1 = session2.get(Profile.class, 1);
		System.out.println(profile1);
		
		session2.close();
		factory.close();
	}

}
