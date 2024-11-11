package com.sprincore.collections;

import java.util.*;

public class Emp {
	private String name;
	private List<String> phone;
	private Set<String> addresses;
	private Properties props;
	private Map<String,String> courses; // show course name and its duration
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String name, List<String> phone, Set<String> addresses, Properties props, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.props = props;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", addresses=" + addresses + ", props=" + props + ", courses="
				+ courses + "]";
	}
	
	
}