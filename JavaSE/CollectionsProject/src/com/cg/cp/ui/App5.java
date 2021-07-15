package com.cg.cp.ui;

import java.util.Iterator;
import java.util.TreeSet;

public class App5 {

	public static void main(String[] args) {
		// HashSet<String> set = new HashSet<>();
		// LinkedHashSet<String> set = new LinkedHashSet<>();
		TreeSet<String> set = new TreeSet<>();
		set.add("apple");
		set.add("mango");
		set.add("grape");
		set.add("litchie");
		set.add("kiwi");
		set.add("apple");
		// set.add(null);
		
		System.out.println(set);
		
		set.remove("litchie");
				
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------------------------------");
		
		for(String data : set) {
			System.out.println(data);
		}
		System.out.println("---------------------------------------");
		
		System.out.println(set.contains("kiwi"));
	}

}
