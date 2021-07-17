package com.cg.iosp.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("names.txt")) {
			int ch = fr.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fr.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not available");
		} catch (IOException e) {
			System.out.println("unable to read");
		}
	}

}