package com.sandeep.test;

public class Person {
	String name;
    int age;

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

	Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return name;
    }
}
