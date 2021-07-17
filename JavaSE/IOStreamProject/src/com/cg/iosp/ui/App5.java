package com.cg.iosp.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App5 {

	public static void main(String[] args) {
		Path filePath = Paths.get("names.txt");
		try {
			List<String> lines = Files.readAllLines(filePath);
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("unable to read");
		}

	}

}
