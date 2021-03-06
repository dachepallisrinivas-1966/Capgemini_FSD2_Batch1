package com.cg.mtp.ui;

public class App5 {

	static class ThreadCode extends Thread {
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
		threadCode.start();
		System.out.println("in main thread again ...");
		for(int i = 10; i >= 1; i--) {
			System.out.println("Main => " + i);
		}
		
		/* The main thread will wait until the child thread is completed.
		 * this is called join.
		 */
		System.out.println("Main thread is waiting ...");
		try {
			threadCode.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of main thread ....");

	}

}
