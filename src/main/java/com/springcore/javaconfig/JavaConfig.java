package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // gives information that it is a configuration file like xml, but here we are using java for configuration instead 
//of xml 
@ComponentScan(basePackages = "com.springcore.javaconfig")//@ComponentScan usually takes packages where class whose object has to be 
//created are present, we can remove this annotation if we remove @component from student,scan all class with component


public class JavaConfig {
	//@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
		
	}
	
	@Bean // gives information that here it return object of bean class which can be used later,object return by it goes to
	//IOC container and we can fetch that object, in this case object name also changed to method name in config file i.e.(getStudent)
	public Student getStudent() { //this is method, it return the object of the bean (Student), return type Student and can give any
		//name of the method here we give getStudent() as method name
		//creating a new student object
		Student student = new Student(getSamosa());//inject information in samosa field
		return student;
	}
	
	@Bean("cold")
	public Coldrink getColdrink() {
		Coldrink coldrink = new Coldrink(getStudent());
		return coldrink;
	}

}

//three ways of configuration 1)<bean> tag, 2)@Component ,3) @Bean all these are used to create object of bean class