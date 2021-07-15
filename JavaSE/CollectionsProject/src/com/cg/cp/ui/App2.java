package com.cg.cp.ui;

import java.util.ArrayList;

public class App2 {

	public static void main(String[] args) {
		// raw collection
		ArrayList al = new ArrayList();
		al.add("Srinivas");
		al.add("Ramesh");
		al.add("Deepa");
		al.add("Raghu Nandan");
		al.add("Anirudh");
		al.add(10);
		al.add(2.5);
		al.add(true);
		
		
		System.out.println(al);
		
		// classic for loop
		int size = al.size();
		for(int i = 0; i < size; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("--------------------------------------------------");
		
		// enhanced for loop
		for(Object data : al) {
			System.out.println(data);
		}
		

	}

}
