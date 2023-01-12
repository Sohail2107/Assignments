package com.test;

public class Author {

	public String name;
	public int age;
	public String gender;
	public Author(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
