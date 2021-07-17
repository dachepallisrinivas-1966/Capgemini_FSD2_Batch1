package com.cg.lp.ui;

public class App1 {

	public static void main(String[] args) {
		// anonymous class
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hello");
			}
		});

		thread.start();

		// lambda - it is meant for functional interface
		Thread thread2 = new Thread(() -> System.out.println("hai"));
		thread2.start();
		
	}

}
