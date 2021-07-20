package in.impulse.swtp.ui;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App5 {

	public static void main(String[] args) {
		
		Callable<String> task1 = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "My task is done";
			}
		};
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(task1);
		
		try {
			while (!future.isDone()) {
				System.out.println("Task still in process ... please wait !!!");
			}
			System.out.println("Task completed");
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException excep) {
				excep.printStackTrace();
			}
		}
		
}
