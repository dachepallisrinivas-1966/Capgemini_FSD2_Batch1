package com.cg.jsep.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App1 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate birthDay = LocalDate.of(1966, 4, 9);
		System.out.println(birthDay);
		
		LocalTime presentTime = LocalTime.now();
		System.out.println(presentTime);
		LocalTime birthTime = LocalTime.of(17, 30, 10);
		System.out.println(birthTime);
		
		LocalDateTime presentDateTime = LocalDateTime.now();
		System.out.println(presentDateTime);
		LocalDateTime birthDateTime = LocalDateTime.of(1977, 12, 23, 5, 45, 15);
		System.out.println(birthDateTime);

	}

}
