package com.sprincore.referenceinjection;

public class B {
	private int y;
	private C oc;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

	public C getOc() {
		return oc;
	}

	public void setOc(C oc) {
		this.oc = oc;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [y=" + y + ", oc=" + oc + "]";
	}

	
	

}
