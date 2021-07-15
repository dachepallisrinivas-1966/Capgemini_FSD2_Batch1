package com.cg.jsep.ui;

import java.time.Duration;
import java.time.LocalTime;

public class App6 {

	public static void main(String[] args) {
		
		LocalTime time1 = LocalTime.of(10, 30, 5);
		LocalTime time2 = LocalTime.of(12, 15, 6);
		Duration d = Duration.between(time1, time2);
		// System.out.println(d.toHours() + " hours " + d.toMinutes() + " minutes " + d.toSeconds() + " seconds ");
		
	}

}
