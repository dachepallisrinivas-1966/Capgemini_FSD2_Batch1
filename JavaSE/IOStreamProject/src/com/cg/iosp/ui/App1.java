package com.cg.iosp.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("names.txt");
			int ch = fr.read();
			while (ch != -1) {
				System.out.print((char)ch);
				ch = fr.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not available");
		} catch (IOException e) {
			System.out.println("unable to read");
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}