package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //automatic create object of the class which can be fetched during run time;
public class Demo {

//using concept of spring expression language(spel) syntax : @Value("#{}"}
	//@Value("3")
	@Value("#{22+22}")
	private int x;
	@Value("#{(1>2)?11:22}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")  //T(class).method(parameter) where T as it is, class name of method we want to use, sqrt is 
	// method name along with parameter, it is static method, it is schema to call static method --> T(class).method(param)
	private double z;
	@Value("#{T(java.lang.Math).E}")// where E is variable of java.lang.math, static variable
	private double e;
	@Value("#{new java.lang.String('Sarvesh Tiwari')}")  // it is object creation, it's general form is --> new object()
	private String name;
	@Value("#{T(java.lang.Math).exp(20)}")
	private int p;
	
	@Value("#{8*3-10>5}")// here we have to write expression we will give true
	private boolean isActive;// by default boolean is false 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z +  " , p= "+ p + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
}
//spels : supports parsing and executing expression with help of @value annotation
