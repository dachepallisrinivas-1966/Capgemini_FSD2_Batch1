package com.cg.sp.ui;

import java.util.Arrays;
import java.util.List;

import com.cg.sp.model.Employee;

public class App1 {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
			new Employee(101, "Srinivas", 40000.0),
			new Employee(102, "Saranya", 45000.0),
			new Employee(103, "Sagar", 10000.0),
			new Employee(103, "Sagar", 10000.0)
			
		);

		empList.stream().forEach( (e) ->  System.out.println(e) );
		System.out.println(empList.stream().count());
		
		empList.stream().distinct().forEach( e -> System.out.println(e) );

	}

}
