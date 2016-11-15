package com.sandeep.test;

public class NewPerson {
	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", nameAndAge=" + nameAndAge + "]";
	}
	private String name;
	private int age;
	private String nameAndAge;
	public NewPerson(String name, int age, String nameAndAge) {
		this.name= name;
		this.age= age;
		this.nameAndAge = nameAndAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNameAndAge() {
		return nameAndAge;
	}
	public void setNameAndAge(String nameAndAge) {
		this.nameAndAge = nameAndAge;
	}
	
	
}
