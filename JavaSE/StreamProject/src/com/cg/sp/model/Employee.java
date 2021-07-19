package com.cg.sp.model;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(empName, empNumber, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName) && empNumber == other.empNumber
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return String.format("[empNumber=%s, empName=%s, salary=%s]", empNumber, empName, salary);
	}
	
	
}
