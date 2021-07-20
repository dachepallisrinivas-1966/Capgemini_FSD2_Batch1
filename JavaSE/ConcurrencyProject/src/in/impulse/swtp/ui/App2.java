package in.impulse.swtp.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task1 started ...");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch(InterruptedException excep) {
					excep.printStackTrace();
				}
				System.out.println(("My task1 end ..."));
			}
		};
		
		
		
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task2 started ...");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch(InterruptedException excep) {
					excep.printStackTrace();
				}
				System.out.println(("My task2 end ..."));
			}
		};
		
		Runnable task3 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task3 started ...");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch(InterruptedException excep) {
					excep.printStackTrace();
				}
				System.out.println(("My task3 end ..."));
			}
		};
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.shutdown();
	}

}
