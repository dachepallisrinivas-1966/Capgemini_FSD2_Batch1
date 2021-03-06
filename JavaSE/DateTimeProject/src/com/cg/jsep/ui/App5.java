package com.cg.jsep.ui;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("Enter date of birth [dd-MM-yyyy] ");
		String strDob = scan.next();
		LocalDate dateOfBirth = LocalDate.parse(strDob, dtf);
		// System.out.println(dateOfBirth.format(dtf));
		
		Period period = Period.between(dateOfBirth, LocalDate.now());
		// System.out.println(period);
		System.out.printf("%d years %d months %d days", period.getYears(), period.getMonths(), period.getDays());
		
		scan.close();
		
	}

}
