package com.cg.jsep.ui;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App4 {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate now = LocalDate.parse("14-07-2021", dtf);
		System.out.println(now.format(dtf));
		
	}

}
