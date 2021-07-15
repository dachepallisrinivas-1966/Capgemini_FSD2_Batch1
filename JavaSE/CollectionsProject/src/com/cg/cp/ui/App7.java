package com.cg.cp.ui;

import java.util.ArrayList;
import java.util.Collections;

public class App7 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Srinivas");
		al.add("Ramesh");
		al.add("Deepa");
		al.add("Raghu Nandan");
		al.add("Anirudh");
		al.add("Deepa");
		
		Collections.sort(al);
		System.out.println(al);
		
		int index = Collections.binarySearch(al, "xyz");
		System.out.println(index >= 0 ? index : "Not found");
		
		Collections.reverse(al);
		System.out.println(al);
	}

}
