package com.cg.mtp.ui;

public class App1 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getId());
		System.out.println(thread.isAlive());

	}

}
