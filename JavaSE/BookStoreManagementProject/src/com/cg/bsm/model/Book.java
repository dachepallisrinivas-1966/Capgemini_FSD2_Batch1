package com.cg.bsm.model;

import java.time.LocalDate;
import java.util.Objects;

public class Book implements Comparable<Book>{
	private String bcode;
	private String title;
	private LocalDate publishDate;
	private double price;
	
	public Book() {
		/* no implementation required */
	}

	public Book(String bcode, String title, LocalDate publishDate, double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.publishDate = publishDate;
		this.price = price;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("[bcode=%s, title=%s, publishDate=%s, price=%s]", bcode, title, publishDate, price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(bcode, price, publishDate, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bcode, other.bcode)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Book o) {
		return this.bcode.compareTo(o.bcode);
	}
}
