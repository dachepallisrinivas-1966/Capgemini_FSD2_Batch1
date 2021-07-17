package com.cg.sp.model;

public class Employee {
	private int empNumber;
	private String empName;
	private double salary;
	
	public Employee() {
		/* no implementation */
	}

	public Employee(int empNumber, String empName, double salary) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("[empNumber=%s, empName=%s, salary=%s]", empNumber, empName, salary);
	}
	
	
}
