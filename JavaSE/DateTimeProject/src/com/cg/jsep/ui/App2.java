package com.cg.jsep.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate birthDay = LocalDate.of(1966, 4, 9);
		System.out.println(birthDay);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date of joining [yyyy-mm-dd] : ");
		String strDoj = scan.next();
		LocalDate dateOfJoin = LocalDate.parse(strDoj);
		System.out.println(strDoj);
		
		System.out.println(dateOfJoin.getDayOfMonth() + "/" + 
				dateOfJoin.getMonthValue() + "/" + 
				dateOfJoin.getYear());
		
		System.out.println(today.isAfter(dateOfJoin));
		

	}

}
