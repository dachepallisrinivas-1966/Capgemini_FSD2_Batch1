package com.cg.cp.ui;

import java.util.ArrayList;
import java.util.Iterator;

public class App3 {

	public static void main(String[] args) {
		// type-safe collection, type inference
		ArrayList<String> al = new ArrayList<>();
		al.add("Srinivas");
		al.add("Ramesh");
		al.add("Deepa");
		al.add("Raghu Nandan");
		al.add("Anirudh");
		al.add("Deepa");
		al.add(null);
			
		
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println("-------------------------------------");
		
		// classic for loop
		int size = al.size();
		for(int i = 0; i < size; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("--------------------------------------------------");
		
		al.add(1, "Navya");
		al.remove(2);
		al.remove("Deepa");
		System.out.println(al.contains("Anirudh"));
		System.out.println(al.indexOf("Deepa"));
	
		
		// enhanced for loop
		for(String data : al) {
			System.out.println(data);
		}

		System.out.println("----------------------------------------------");
		// iterator
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
