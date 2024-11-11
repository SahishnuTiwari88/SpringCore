package com.springcore.stereotype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // component annotation is responsible for creating object of the class and follow camel case,in component we can pass our own object name like
//@Component("ob"), if class name is--> Studentfamily, object-->studentFamily(camel-case)
@Scope("prototype")
public class Student {  
	@Value("Sahishnu Tiwari")
	private String studentName;
	@Value("Delhi")  // @Value is used to provide value to the given variables
	private String city;
	@Value("#{city1}") // this is known as spring expression language i.e. start with #
	private List<String> address;
	@Value("#{map}")
	private Map<String,Integer> studentDetail; //<name,roll>
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	public Map<String, Integer> getStudentDetail() {
		return studentDetail;
	}
	public void setStudentDetail(Map<String, Integer> studentDetail) {
		this.studentDetail = studentDetail;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + ", studentDetail="
				+ studentDetail + "]";
	}
	
	
}
//stereotype annotation - whatever object creation we done till now using xml same can be done using annotation.
//for this to work we have to mention<context:component-scan base-package=""/> and provide package name where @Component is present

//Singleton - By default by spring container, it means only one object is created and provided to all places where we called it.
//prototype -  it provides new object each time we call, or try to get object
