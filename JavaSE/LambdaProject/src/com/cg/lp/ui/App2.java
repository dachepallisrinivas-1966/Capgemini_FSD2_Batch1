package com.cg.lp.ui;

import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		String [] names = { "suresh", "ramesh", "raghava", "sudheer", "adi", "anu" };
		List<String> namesList = Arrays.asList(names);
		
		for(String name : namesList) {
			if (name.length() > 4) {
				System.out.println(name);
			}
		}
		System.out.println("--------------------------");
		
		for(String name : namesList) {
			if (name.endsWith("sh")) {
				System.out.println(name);
			}
		}
		
	

	}

}
