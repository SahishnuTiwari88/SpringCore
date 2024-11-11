package com.springcore.autowire.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	//auto wiring at property/variable-->1
	@Qualifier("address1")//if there are multiple bean in the config file then we specify the name of the bean(from config) 
	//in Qualifier so so that it fetch specific information 
	private Address address; //here type is Address then so its type is search in bean in config file

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	//auto wiring at setter injection-->2
	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	//auto wiring at constructor injection-->3
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}
	

}
