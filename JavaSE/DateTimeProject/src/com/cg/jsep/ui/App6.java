package com.cg.jsep.ui;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		
		// LocalTime time1 = LocalTime.of(10, 30, 5);
		// LocalTime time2 = LocalTime.of(12, 15, 6);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter login time (HH:mi:ss) : ");
		String strTime1 = scan.next();
		LocalTime time1 = LocalTime.parse(strTime1, DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println("Enter logout time (HH:mi:ss) : ");
		String strTime2 = scan.next();
		LocalTime time2 = LocalTime.parse(strTime2, DateTimeFormatter.ofPattern("HH:mm:ss"));
		Duration duration = Duration.between(time1, time2);
		
		System.out.printf("%d hours, %d minutes, %d seconds",
			    duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart()
		);
		
		scan.close();
	}

}
