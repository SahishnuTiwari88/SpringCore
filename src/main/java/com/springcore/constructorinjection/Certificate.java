package com.springcore.constructorinjection;

public class Certificate {
//	private String certinum;
//	private String name;
	 String certinum;
	 String name;
	
	
	public Certificate(String certinum, String name) {
		super();
		this.certinum = certinum;
		this.name = name;
	}
	@Override
	public String toString() {
		return this.certinum+"  : "+this.name;
	}

	

}
