package com.xworkz.studental;

public class Student {
	
	private int age;
	private String name;
	private String address;
	//Student{age, name , address}
	public Student(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
}
