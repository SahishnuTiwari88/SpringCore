package com.springcore.autowire.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@Autowired
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/usingxml/config.xml");
		//Emp emp = (Emp) context.getBean("emp"); 
		Emp emp = context.getBean("emp",Emp.class);// if we don't want to do type casting we pass Emp.class 
		System.out.println(emp);

	}

}

