/* 
 * Priority between 1 to 10
 * NORM_PRIORITY = 5
 * MIN_PRIORITY = 1
 * MAX_PRIORITY = 10
 * 
 * java.lang.IllegalArgumentException
 * 
 */
package com.cg.mtp.ui;

public class App6 {

	static class ChildThread extends Thread {
		@Override
		public void run() {
			for(int i=1; i<=10; i++) {
				System.out.println("Child-1 => " + i);
			}
		}
	}
	
	static class ChildThread2 extends Thread {
		@Override
		public void run() {
			for(int i=100; i<=120; i++) {
				System.out.println("Child-2 => " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("In main()");
		
		ChildThread child = new ChildThread();
		child.setPriority(Thread.MIN_PRIORITY);
		child.start();
		
		ChildThread2 child2 = new ChildThread2();
		child2.setPriority(Thread.MAX_PRIORITY);
		child2.start();
		
		/* 
		 * thread which has higher priority is executed first than other threads
		 */
		
		System.out.println("In main() again");
		for(int i=10; i>=1; i--) {
			System.out.println("Main => " + i);
		}
		System.out.println("End of main()");

	}

}
