package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		//Demo d = con.getBean("demo",Demo.class);
		Demo d = (Demo) con.getBean("demo");
		System.out.println(d);
		
		//spel api provide us class to solve expressions
		SpelExpressionParser temp = new SpelExpressionParser(); //it is class under spel
		Expression exp = temp.parseExpression("12+44+44");  // here expression is given directly not ("#{}") it is only used with @Value
		System.out.println(exp.getValue());

	
	}
}
