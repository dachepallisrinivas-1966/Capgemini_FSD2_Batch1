package com.cg.jsep.ui;

import java.time.LocalTime;
import java.time.ZoneId;

public class App3 {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalTime tokyoTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(tokyoTime);
	}

}
