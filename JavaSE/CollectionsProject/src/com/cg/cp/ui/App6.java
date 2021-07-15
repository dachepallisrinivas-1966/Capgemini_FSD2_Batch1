package com.cg.cp.ui;

import java.util.TreeMap;

public class App6 {

	public static void main(String[] args) {
		// HashMap<String, Integer> map = new HashMap<>();
		// LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Srinivas", 55);
		map.put("Sreeja", 21);
		map.put("Geetha", 20);
		map.put("Navya", 34);
		map.put("Kiran", 38);
		map.put("Ramana", 34);
		map.put("Sreeja", 22);
		
		// Set<Entry<String, Integer>> entries = map.entrySet();
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		map.remove("Geetha");
		System.out.println("---------------------------------------------");
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		
		
		
	}

}
