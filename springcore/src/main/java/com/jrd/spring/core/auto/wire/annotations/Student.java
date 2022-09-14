package com.jrd.spring.core.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("address")
	
	private Address address;

	public Address getAddress() {
		return address;
	}
   // @Autowired
    //@Qualifier("address1")
	public void setAddress(Address address)
	{
		System.out.println("setting value");
		this.address = address;
	}

	public Student(Address address){
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	
}
