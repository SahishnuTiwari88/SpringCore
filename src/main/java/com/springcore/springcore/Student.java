package com.springcore.springcore;

public class Student {
	public Student(int stdId, String stdName, String address) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.address = address;
	}
	private int stdId;
	private String stdName;
	private String address;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", address=" + address + "]";
	}

}
