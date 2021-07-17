package com.cg.iosp.ui;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("students.txt");
		Scanner scan = new Scanner(System.in);) {
			System.out.println("Enter names to write [type 'end' to stop] : ");
			String name = "";
			while (true) {
				name = scan.nextLine();
				if (name.equals("end"))
					break;
				fw.write(name + "\n");
			}
			
		} catch (IOException e) {
			System.out.println("unable to write");
		}

	}

}
