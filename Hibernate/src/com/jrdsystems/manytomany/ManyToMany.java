package com.jrdsystems.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEid(10);
		emp.setName("Hi");
		
		Employee emp1 = new Employee();
		emp1.setEid(11);
		emp1.setName("Hello");
		
		Project pr = new Project();
		pr.setPid(1);
		pr.setProjectName("Project 1");
		
		Project pr1 = new Project();
		pr1.setPid(2);
		pr1.setProjectName("Project 2");
		
		
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(emp);
		list1.add(emp1);
		
		List<Project> list2 = new  ArrayList<Project>();
		list2.add(pr);
		list2.add(pr1);
		
		emp.setProject(list2);
		pr1.setEmployee(list1);
		
		
		session.save(emp);
		session.save(pr);
		session.save(emp1);
		session.save(pr1);
		
		
		tx.commit();
		session.close();
		factory.close();
	}

}
