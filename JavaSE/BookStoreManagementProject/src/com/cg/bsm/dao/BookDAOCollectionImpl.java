package com.cg.bsm.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.bsm.excep.BookStoreException;
import com.cg.bsm.model.Book;

public class BookDAOCollectionImpl implements IBookDAO {

	private Map<String, Book> books;
	
	public BookDAOCollectionImpl() {
		books = new TreeMap<>();
	}
	
	@Override
	public String add(Book book) throws BookStoreException {
		String bcode = null;
		if (book != null) {
			bcode = book.getBcode();
			books.put(bcode, book);	
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDone = false;
		if (bcode != null) {
			books.remove(bcode);
			isDone = true;
		}
		return isDone;
	}

	@Override
	public Book get(String bcode) throws BookStoreException {
		return books.get(bcode);
	}

	@Override
	public List<Book> getAllBooks() throws BookStoreException {
		return new ArrayList<>(books.values());
	}

	@Override
	public boolean update(Book book) throws BookStoreException {
		boolean isDone = false;
		if (book != null) {
			String bcode = book.getBcode();
			books.replace(bcode, book);
		}
		return isDone;
	}

}
