package com.cg.rep.ui;

public class App1 {

	public static void main(String[] args) {
		String mobile = "9247175823";
		String mobile2 = "01234";
		String pattern = "[1-9]\\d{9}";
		
		System.out.println(mobile.matches(pattern));
		System.out.println(mobile2.matches(pattern));
	}

}
