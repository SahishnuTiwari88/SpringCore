package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> Booklist;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int personId, Certificate certi,List<String> Booklist) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.Booklist = Booklist;
	}

	@Override
	public String toString() {
		//return this.name+" : "+this.personId+"  : "+this.certi; // it works when properties are private in Certificate class
		return this.name+" : "+this.personId+"  {"+this.certi.certinum+" : "+this.certi.name+"}"+" : "+this.Booklist; // it will work when properties are 
		//public in the Certificate class
	}

	

}
