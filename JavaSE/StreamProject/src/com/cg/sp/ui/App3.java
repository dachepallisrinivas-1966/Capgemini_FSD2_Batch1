package com.cg.sp.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App3 {

	public static void main(String[] args) throws IOException {
		Files.lines(Path.of("names.txt"))
			.limit(2)
			.forEach(System.out::println);

	}

}
