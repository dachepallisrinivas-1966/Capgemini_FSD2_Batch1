package in.impulse.swtp.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App1 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("My task1 ...");
			}
		};
		
		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			System.out.println("My task2 ...");
		};
		
		executorService.submit(task1);
		executorService.submit(task2);
		
		executorService.shutdown();
	}

}
