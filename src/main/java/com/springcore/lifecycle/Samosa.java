package com.springcore.lifecycle;

//life cycle implementation using XML file(contains init and destroy method for each bean i.e. class(pojo)

public class Samosa {
	private double price;
	private String uname; //shopkeeper name
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Setting samosa price");
		this.price = price;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("Setting shopkeeper name");
		this.uname = uname;
	}
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Samosa [price=" + price + ", uname=" + uname + "]";
	}
	
	public void hi() { // we can change name of the methods and called after setting the property i.e price,uname
		System.out.println("Inside the init method : Hi, how are You ?");
	}
	//we just to inform that, one work on initialization & other work on destroy, we don't have to call these methods, it is all handled by spring itself
	//we just have to mention it in configuration i.e. xml file
	public void bye() {
		System.out.println("Inside the destroy method : bye I'm getting late");
	}
	

}
