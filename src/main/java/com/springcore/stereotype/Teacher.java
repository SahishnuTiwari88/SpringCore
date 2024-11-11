package com.springcore.stereotype;

//import org.springframework.beans.factory.annotation.Value;

//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//@Component
//@Scope("prototype")
public class Teacher {
	//@Value("Shyam")
	private String tname;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Teacher [tname=" + tname + "]";
	}

}
