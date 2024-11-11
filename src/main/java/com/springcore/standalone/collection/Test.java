package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		Person per = context.getBean("person",Person.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("==========================================");
		System.out.println(per.getFeestructure());
		System.out.println(per.getFeestructure().getClass().getName());
		System.out.println("==========================================");
		System.out.println(per.getProperties());
		System.out.println(per.getProperties().getClass().getName());
	}

}
