package com.cg.cp.service;

import java.util.Comparator;

import com.cg.cp.model.Book;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		double p1 = o1.getPrice();
		double p2 = o2.getPrice();
		
		if (p1 == p2)
			return 0;
		else if (p1 > p2)
			return 1;
		else 
			return -1;
	}

}


