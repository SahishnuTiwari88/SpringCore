package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student std1 = context.getBean("student",Student.class);  //here we pass "student" as object b/c it was created using @component
		//and Student.class passed to indicate it is the class
//		System.out.println(std1);
//		System.out.println(std1.getAddress());
//		System.out.println(std1.getAddress().getClass().getName());
		System.out.println(std1.getAddress());
		System.out.println(std1.getStudentDetail());
		
		System.out.println("-------------Student Hashcode----------------------");
		
		//hashcode is method of object class used in all class
		System.out.println(std1.hashCode());
		Student std2 = context.getBean("student",Student.class); // it is singleton case, it doesn't create new object
		//if we want to change object during each call we have to change scope from singleton to prototype
		// it is done as <bean class = "" name = "" scope = ""/> for changing object during each call in xml file
		// while in case of annotation we use @Scope with @Component in the class
		System.out.println(std2.hashCode());
		
		System.out.println("-------------Teacher Hashcode----------------------");
		Teacher teac = context.getBean("teacher",Teacher.class);
		System.out.println(teac.getTname());
		System.out.println(teac.hashCode());
		Teacher teac1 = context.getBean("teacher",Teacher.class);
		System.out.println(teac1.hashCode());
	}

}
