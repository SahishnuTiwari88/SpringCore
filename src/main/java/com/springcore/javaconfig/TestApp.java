package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/javaconfig/JavaConfig");//it also gives error b/c 
		//xml config file is not present, so we uses another version which uses annotation like
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);// here we pass our annotation class
		
		Student std = con.getBean("getStudent",Student.class);//method name in config file is used as bean name i.e. getStudent, in
		// case of @Bean
		System.out.println(std);
		std.study();
		Samosa sam = con.getBean("samosa",Samosa.class);
		System.out.println(sam);
		sam.display();
		
		Coldrink cold = con.getBean("cold",Coldrink.class);
		System.out.println(cold);
		cold.sleep();

	}

}
