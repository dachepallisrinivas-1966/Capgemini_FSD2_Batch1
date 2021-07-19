package com.cg.sp.ui;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.regex.Pattern;

import com.cg.sp.model.Employee;

public class App2 {

	private static boolean isNumber(String num) {
		return Pattern.matches("\\d+", num);
	}
	
	public static void main(String[] args) {

		String [] courses = new String[] { "Python", "Java", "C#", "JavaScript", "C", "Ruby", "TypeScript" };

		Arrays.stream(courses)
				.sorted()
				.forEach(course -> System.out.println(course));
		
		System.out.println("------------------------------------------------");
		
		Arrays.stream(courses)
				.filter(c -> c.length() >= 4)
				.sorted()
				.forEach(c -> System.out.println(c));
		System.out.println("------------------------------------------------");
		
		String[] marks =  {"50", "90", "56", "98", "76" };
		int sum = Arrays.stream(marks)
				.mapToInt(s -> Integer.parseInt(s))
				.sum();
		System.out.println(sum);
		System.out.println("------------------------------------------------");
		
		String[] marks2 =  {"50", "90", "56", "98", "76", "200", "300", "450", "1234" };
		int sum2 = Arrays.stream(marks2)
				.mapToInt(s -> Integer.parseInt(s))
				.filter(n -> n <= 100)
				.sum();
		System.out.println(sum2);
		System.out.println("------------------------------------------------");
		
		String[] marks3 =  {"50", "90", "56", "98", "76", "200", "300", "450", "1234", "abcd", "xyz"};
		int sum3 = Arrays.stream(marks3)
				// .filter(s -> isNumber(s))
				.filter(App2::isNumber)			// method reference on static method
				.mapToInt(s -> Integer.parseInt(s))
				.filter(n -> n <= 100)
				.sum();
		System.out.println(sum3);
		System.out.println("------------------------------------------------");
		
		String[] words = { "madam", "boy" ,"girl", "dad", "mom" };
		Arrays.stream(words).forEach(System.out::println);  // method reference on instance method
		System.out.println("------------------------------------------------");
		
		String[] marks4 =  {"50", "90", "56", "98", "76", "200", "300", "450", "1234", "abcd", "xyz"};
		OptionalDouble avg = Arrays.stream(marks4)
				.filter(App2::isNumber)			// method reference on static method
				.mapToInt(Integer::parseInt)	// method reference on static method
				.filter(n -> n <= 100)
				.average();
		System.out.println(avg.getAsDouble());
		System.out.println("------------------------------------------------");
		
		
		
		
		
	}

}
