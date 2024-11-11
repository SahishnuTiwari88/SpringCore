package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLifecycle {
	private String subject;
	private int marks;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public AnnotationLifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AnnotationLifecycle [subject=" + subject + ", marks=" + marks + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting method : init (postconstructor)");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method : destroy (predestroy)");
	}
//postconstruct and predestroy are disable by default we have to enable it in config file using <context:annotation-config/>
}
