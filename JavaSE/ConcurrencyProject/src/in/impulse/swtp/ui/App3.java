package in.impulse.swtp.ui;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import in.impulse.swtp.service.TaskService;

public class App3 {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1); // since we have only one task

		TaskService taskService = new TaskService();
		scheduledExecutorService.schedule(taskService, 5, TimeUnit.SECONDS);
		
		scheduledExecutorService.shutdown();
	}

}
