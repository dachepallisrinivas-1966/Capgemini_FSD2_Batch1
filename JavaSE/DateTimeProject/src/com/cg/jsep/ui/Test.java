package com.cg.jsep.ui;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		System.out.println(System.getenv("os"));
		
		// < jdk 1.5
		int a = 100;
		// Integer obj = Integer.valueOf(a);
		// System.out.println(obj);
		
		// >= jdk 1.5
		Integer obj2 = a;		// auto-boxing
		System.out.println(obj2);
		
		// auto-unboxing
		Double b = 123.54;
		// System.out.println(Double.valueOf(b));
		System.out.println(b);	// auto-unboxing
		
		
		// operator overloading
		Double c = b + 3;
		System.out.println(c);
		

		
		
	}

}


