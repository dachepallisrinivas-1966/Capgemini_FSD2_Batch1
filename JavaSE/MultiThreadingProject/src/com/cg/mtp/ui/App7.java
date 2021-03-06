package com.cg.mtp.ui;


class Data {
	/* synchronized */ public void print() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " => " + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}
}


public class App7 {

	static class ChildThread extends Thread {
		Data data;
		public ChildThread(Data data) {
			this.data = data;
		}
		@Override
		public void run() {
			
			synchronized(data) {
				data.print();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Data data = new Data();
		
		ChildThread threadOne, threadTwo;
		threadOne = new ChildThread(data);
		threadOne.setName("Thread-1");
		threadTwo = new ChildThread(data);
		threadTwo.setName("Thread-2");
		
		threadOne.start();
		threadTwo.start();

	}

}
