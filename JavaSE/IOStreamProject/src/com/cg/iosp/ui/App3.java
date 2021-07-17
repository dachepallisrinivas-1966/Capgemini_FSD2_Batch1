package com.cg.iosp.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("names.txt");
			 BufferedReader br = new BufferedReader(fr);) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not available");
		} catch (IOException e) {
			System.out.println("unable to read");
		}
	}

}