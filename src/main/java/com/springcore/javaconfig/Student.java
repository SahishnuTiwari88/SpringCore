package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //all configuration given in java config file, object is created using @Bean annotation in java config file, by creating 
//and returning object of student type
public class Student {
	
	private Samosa samosa;//we are performing constructor injection
	
	//@Bean gives us information that we have to create object of the method mentioned in config file, so that object returned by this
	//can be used later,if use use @Bean on any method then there is no need to use @Component on its corresponding class
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		samosa.display();
		System.out.println("Good student study each concepts throughly");
	}
	public void sleep() {
		System.out.println("going to sleep....");
	}

}
