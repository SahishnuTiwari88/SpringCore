package com.sprincore.referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprincore/referenceinjection/refconfig.xml");
		A a = (A)context.getBean("Aref");
		B b = (B)context.getBean("Bref");
		C c = (C)context.getBean("Cref");
		
		System.out.println(c.getZ());
		System.out.println(b.getY());
		System.out.println("x ="+a.getX()+"  y ="+a.getOb().getY()+"  z ="+a.getOb().getOc().getZ());
		System.out.println(a.getX()+a.getOb().getY()+a.getOb().getOc().getZ());

	}

}
