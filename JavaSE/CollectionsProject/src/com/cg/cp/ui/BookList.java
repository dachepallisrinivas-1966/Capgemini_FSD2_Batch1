package com.cg.cp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cg.cp.model.Book;
import com.cg.cp.model.Category;
import com.cg.cp.service.PriceComparator;

public class BookList {

	public static void main(String[] args) {

		// program-to-interface
		List<Book> books = new ArrayList<>();
		
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
		
		Collections.sort(books);
		
		
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("-----------------------------------------");
		
		// Collections.sort(books, new PriceComparator());
		
		Collections.sort(books, (o1, o2) -> {
			Double p1 = o1.getPrice();
			Double p2 = o2.getPrice();
			
			return p1.compareTo(p2);
		});
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		System.out.println("-----------------------------------------");
	}

}
