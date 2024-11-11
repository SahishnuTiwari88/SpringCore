package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student std = (Student)context.getBean("student");
        Student std1 = (Student)context.getBean("student1");
        System.out.println(std);
        System.out.println(std1);
    }
}
