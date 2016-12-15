package com.lambda.entity;

public class Person {

	private String name;
	private String gender;
	private Integer age;
	private String city;
	private String state;
	public Person(String name, String gender, Integer age, String city,
			String state) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public Integer getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}

}
