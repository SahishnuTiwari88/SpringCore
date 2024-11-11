package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person per = (Person)context.getBean("person1");
		
		System.out.println(per);
		
		Addition add = (Addition)context.getBean("add");
		System.out.println(add);
		add.doSum();
//		
		

	}

}
