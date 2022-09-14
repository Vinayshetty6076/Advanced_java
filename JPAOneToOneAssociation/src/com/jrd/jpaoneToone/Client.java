package com.jrd.jpaoneToone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		System.out.println("Hi");
		entityManager.getTransaction().begin();
		
		Student student=new Student();
		student.setName("vinay");
		
		Address permanetAddress=new Address();
		permanetAddress.setStreet("7th cross, 5th ward");
		permanetAddress.setCity("tumkur");
		permanetAddress.setState("Karnataka");
		permanetAddress.setZipCode("563288");
		
		student.setAddress(permanetAddress);
		entityManager.persist(student);
		
		entityManager.getTransaction().commit();
		System.out.println("Added one student with address to database.");
		entityManager.close();
		entityManagerFactory.close();
	}

}