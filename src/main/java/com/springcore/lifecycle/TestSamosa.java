package com.springcore.lifecycle;

//life cycle implementation using XML file


//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {

	public static void main(String[] args) {
		// TODO Auto-generated method  stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//we use AbstractApplicationContext b/c it has register shutdown hook option and it triggers destroy method
		context.registerShutdownHook();
		
		Samosa s1 = (Samosa)context.getBean("samosa");
		System.out.println(s1);
//		context.registerShutdownHook(); //it will call destroy method mention in configuration file i.e. xml file
		
		
//for destroy method to work we have to enable pre-shut down hook on context, on the basic of which context call the 
//required methods
		
		System.out.println("=============================Using Interface=====================================");

		ColdDrink drink = (ColdDrink) context.getBean("drink");
		System.out.println(drink);
		//context.registerShutdownHook();
		System.out.println("===========================Using Annotation=======================================");
	AnnotationLifecycle ann = 	(AnnotationLifecycle) context.getBean("anno");
	System.out.println(ann);
		

	}

}
//for postconstruct and predestroy we have to add dependency in pom.xml file (Annotation-api) if we are using java version greater than 8
//postconstruct and predestroy are available till java 8 therefore till 8 version don't need dependency in pom.xml
