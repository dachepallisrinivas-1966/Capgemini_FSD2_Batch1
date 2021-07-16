package com.cg.cp.ui;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.cg.cp.model.Book;
import com.cg.cp.model.Category;

public class BookSet {

	public static void main(String[] args) {

		// program-to-interface
		Set<Book> books = new HashSet<>();
		
		books.add(new Book(101, "Let us C", LocalDate.of(2021, 2, 5), 260.0, Category.ACADEMIC));
		books.add(new Book(102, "Secret", LocalDate.of(2020, 12, 10), 400.0, Category.NON_FICTION));
		books.add(new Book(103, "Alchemy", LocalDate.of(2020, 12, 10), 300.0, Category.NON_FICTION));
		books.add(new Book(105, "Harry potter", LocalDate.of(2021, 3, 5), 260.0, Category.FICTION));
		books.add(new Book(104, "Java Black Book", LocalDate.of(2021, 4, 10), 260.0, Category.ACADEMIC));
		books.add(new Book(107, "Inception", LocalDate.of(2021, 2, 5), 310.0, Category.FICTION));
		books.add(new Book(101, "Let us C", LocalDate.of(2021, 2, 5), 260.0, Category.ACADEMIC));
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		System.out.println("-----------------------------------------");
		

	}

}
