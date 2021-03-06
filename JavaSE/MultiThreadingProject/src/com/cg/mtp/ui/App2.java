package com.cg.mtp.ui;

class ChildThread extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("child thread : " + i);
			if ( i > 3) {
				this.stop();
			}
		}
	}
}

public class App2 {

	public static void main(String[] args) {
		System.out.println("in main thread ...");
		ChildThread child = new ChildThread();
		child.start();
		System.out.println("in main thread again ..");
		for(int i = 10; i >= 1; i--) {
			System.out.println("main thread : " + i);
		}
		System.out.println("end of main thread ....");
	}

}
