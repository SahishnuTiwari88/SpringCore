package com.springcore.autowire.usingxml;

public class Address {
	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	

}
//AutoWiring -  feature of spring framework where spring container(IOC) injects dependency automatically.
//it only works with object(referance) not with primitive and string values.
//Autowiring done using XML or Annotation
//in xml done by byName,byType,constructor
//in Annotation used by @Autowired