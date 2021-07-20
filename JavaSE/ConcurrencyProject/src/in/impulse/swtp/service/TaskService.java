package in.impulse.swtp.service;

public class TaskService implements Runnable {

	@Override
	public void run() {
		
		System.out.println("task started ...");
		System.out.println(Thread.currentThread().getName());
		System.out.println("task finished ...");
	}

}
