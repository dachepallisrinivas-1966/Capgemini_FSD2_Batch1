package com.cg.cp.model;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
	private int bcode;
	private String bname;
	private LocalDate datePublished;
	private double price;
	private Category category;
	
	public Book() {
		/* implentation is required */
	}

	public Book(int bcode, String bname, LocalDate datePublished, double price, Category category) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.datePublished = datePublished;
		this.price = price;
		this.category = category;
	}

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public LocalDate getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(LocalDate datePublished) {
		this.datePublished = datePublished;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return String.format("[bcode=%s, bname=%s, datePublished=%s, price=%s, category=%s]", bcode, bname,
				datePublished, price, category);
	}

	@Override
	public int compareTo(Book o) {
		if (this.bcode == o.bcode)
			return 0;
		else if (this.bcode > o.bcode) 
			return 1;
		else
			return -1;
		
		// return this.bname.compareTo(o.bname);
		
	}
}
