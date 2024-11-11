package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ColdDrink implements InitializingBean,DisposableBean { //init, destroy using interface
	private double price;
	private String prodname;

	//init and destroy using interface InitializingBean,DisposableBean
	
	public ColdDrink() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	@Override
	public String toString() {
		return "ColdDrink [price=" + price + ", prodname=" + prodname + "]";
	}
	public void afterPropertiesSet() throws Exception { 
		// TODO Auto-generated method stub
		// it is init method
		System.out.println("Taking coldDrink : init");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Cold drink over : destroy");
		
	}
	

}
//init method--> mainly for initialization code,loading config,connecting bd, webservice etc
//we can change name of init and destroy method but it's signature remains same
//destroy - for clean up
