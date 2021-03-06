package com.cg.mtp.ui;

public class App4 {

	static class ThreadCode implements Runnable {
		@Override
		public void run() {
			for(int i = 1; i <= 10; i++) {
				System.out.println("Thread Code => " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("In main thread ...");
		ThreadCode threadCode = new ThreadCode();
		Thread thread = new Thread(threadCode);
		thread.start();
		System.out.println("in main thread again ...");
		for(int i = 10; i >= 1; i--) {
			System.out.println("Main => " + i);
		}
		System.out.println("end of main thread ....");

	}

}
