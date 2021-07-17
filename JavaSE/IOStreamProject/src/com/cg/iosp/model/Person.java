package com.cg.iosp.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	
	public Person() {
		/* no implementation required */
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
	
}
