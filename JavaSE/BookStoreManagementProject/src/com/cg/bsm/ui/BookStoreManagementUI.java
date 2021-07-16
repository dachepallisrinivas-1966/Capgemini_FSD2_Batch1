package com.cg.bsm.ui;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cg.bsm.excep.BookStoreException;
import com.cg.bsm.model.Book;
import com.cg.bsm.model.BookStoreAppMenu;
import com.cg.bsm.service.BookServiceImpl;
import com.cg.bsm.service.IBookService;

public class BookStoreManagementUI {
	private static IBookService bookService;
	private static Scanner scan;
	private static DateTimeFormatter dtFormater;
	
	public static void main(String[] args) {
		try {
			bookService = new BookServiceImpl();
		} catch (BookStoreException e) {
			e.printStackTrace();
		}
		
		scan = new Scanner(System.in);
		dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		BookStoreAppMenu menu = null;

		while (menu != BookStoreAppMenu.QUIT) {

			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (BookStoreAppMenu m : BookStoreAppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			
			System.out.print("Choice: ");
			int choice = -1;
			if (scan.hasNextInt())
				choice = scan.nextInt();
			else {
				scan.next();
				System.out.println("Please choose a choice displayed");
				continue;
			}
			
			if (choice < 0 || choice >= BookStoreAppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = BookStoreAppMenu.values()[choice];
				
				switch (menu) {
					case ADD:	doAdd();
								break;
					case LIST: 	doList();
								break;
					case SEARCH:doSearch();
								break;
					case REMOVE:doRemove();
								break;
					case QUIT:	System.out.println("ThanQ Come Again!");
								break;
				}
			}
		}
		
		scan.close();
	}
	
	private static void doAdd() {
		try {
			Book book = new Book();
			System.out.print("BCode: ");
			book.setBcode(scan.next());
			System.out.print("Title: ");
			book.setTitle(scan.next());
			System.out.print("PublishDate(dd-MM-yyyy): ");
			String pubDtStr = scan.next();

			try {
				book.setPublishDate(LocalDate.parse(pubDtStr, dtFormater));
			} catch (DateTimeException exp) {
				throw new BookStoreException("Date must be in the format day(dd)-month(MM)-year(yyyy)");
			}
			
			System.out.print("Price: ");
			if (scan.hasNextDouble())
				book.setPrice(scan.nextDouble());
			else {
				scan.next();
				throw new BookStoreException("Price is a number");
			}

			String bcode = bookService.add(book);
			System.out.println("Book is Added with code: " + bcode);
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	private static void doList() {
		List<Book> books;
		try {
			books = bookService.getAllBooks();
			if (books.isEmpty()) {
				System.out.println("No Books To display");
			} else {
				for (Book b : books) {
					System.out.println(b);
				}
			}
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	private static void doSearch() {
		System.out.print("BCode: ");
		String bcode = scan.next();

		try {
			Book book = bookService.get(bcode);
			if (book != null) {
				System.out.println(book);
			} else {
				System.out.println("No Such Book");
			}
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}
	
	private static void doRemove() {
		System.out.print("BCode: ");
		String bcode = scan.next();
		try {
			boolean isDone = bookService.delete(bcode);
			if (isDone) {
				System.out.println("Book is Deleted");
			} else {
				System.out.println("No Such Book");
			}
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}
	
}
