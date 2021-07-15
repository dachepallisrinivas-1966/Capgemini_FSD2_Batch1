package com.cg.cp.ui;

import java.util.Iterator;
import java.util.LinkedList;

public class App4 {

	public static void main(String[] args) {
		// type-safe collection, type inference
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		System.out.println(ll);
		
		System.out.println(ll.get(3));
		System.out.println("-------------------------------------");
		
		// classic for loop
		int size = ll.size();
		for(int i = 0; i < size; i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("--------------------------------------------------");
		
		ll.addFirst(99);
		ll.addLast(599);
		
		// enhanced for loop
		for(Integer data : ll) {
			System.out.println(data);
		}

		System.out.println("----------------------------------------------");
		ll.removeFirst();
		ll.removeLast();
		
		// iterator
		Iterator<Integer> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
