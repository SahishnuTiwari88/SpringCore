package com.springcore.javaconfig;

public class Coldrink {
	private Student student;

	public Coldrink(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void sleep() {
		student.sleep();
		System.out.println("Finish coldrink...");
	}

}
