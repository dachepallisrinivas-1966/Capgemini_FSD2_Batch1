package in.impulse.swtp.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task1 is started ...");
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch(InterruptedException excep) {
					excep.printStackTrace();
				}
				
			}
		};
		
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task2 is started ...");
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch(InterruptedException excep) {
					excep.printStackTrace();
				}
				
			}
		};

		Runnable task3 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task3 is started ...");
				
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch(InterruptedException excep) {
					excep.printStackTrace();
				}
				
			}
		};
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.shutdown();
	}

}
