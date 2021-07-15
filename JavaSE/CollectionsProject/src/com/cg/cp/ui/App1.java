package com.cg.cp.ui;

public class App1 {

	static class Swapper<T> {
		public void swap(T a, T b) {
			System.out.println("before swapping => a = " + a + "\t" + "b = " + b);
			T  temp = a;
			a = b;
			b = temp;
			System.out.println("after swapping => a = " + a + "\t" + "b = " + b);
		}
	}
	
	public static void main(String[] args) {
		Swapper<Integer> s1 = new Swapper<Integer>();
		s1.swap(10, 20);
		Swapper<Double> s2 = new Swapper<Double>();
		s2.swap(1.2, 3.4);
		Swapper<String> s3 = new Swapper<String>();
		s3.swap("Srinivas", "Dachepalli");
	}

}
