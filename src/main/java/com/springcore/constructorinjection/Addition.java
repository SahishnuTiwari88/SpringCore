package com.springcore.constructorinjection;

// we use addition class to show the ambiguity case, i.e. if two constructor have same type of parameter

public class Addition {
	private int a;
	private int b;
public Addition(int a, int b) { 
		
		this.a = a;
		this.b = b;
		System.out.println("Constructor is int , int type");
	}
public Addition(double a, double b) {
		
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor is double , double type");
	}
public Addition(String a, String b) {
	
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("Constructor is String , String type");
}

public void doSum() {
	System.out.println("Value of A :"+this.a);
	System.out.println("Value of B :"+this.b);
	System.out.print("Addition is :"+(this.a+this.b));
}
	

}
