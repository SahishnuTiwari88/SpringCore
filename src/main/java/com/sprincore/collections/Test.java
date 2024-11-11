package com.sprincore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprincore/collections/cconfig.xml");
		Emp emp = (Emp)context.getBean("Emp");
		//System.out.println(emp);
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		System.out.println(emp.getProps());
		

	}

}
