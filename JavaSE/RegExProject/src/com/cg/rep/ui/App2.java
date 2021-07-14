package com.cg.rep.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {

	public static void main(String[] args) {
		String mobile = "9247175823";
		String mobile2 = "01234";
		
		// 1. define the pattern
		Pattern pattern = Pattern.compile("[1-9]\\d{9}");
				
		// 2. get the matcher object
		Matcher matcher = pattern.matcher(mobile);
		// 3. check whether matches or not
		System.out.println(matcher.matches());
		
		Matcher matcher2 = pattern.matcher(mobile2);
		System.out.println(matcher2.matches());
		
		String passage = "I have to port 9247212540 into a new 9247212539";
        Matcher m2 = pattern.matcher(passage);
        System.out.println(m2.find());
		
		
	}

}
