package com.cg.bsm.dao;

import java.util.List;

import com.cg.bsm.excep.BookStoreException;
import com.cg.bsm.model.Book;

public interface IBookDAO {
	String add(Book book) throws BookStoreException;
	boolean delete(String bcode) throws BookStoreException;
	Book get(String bcode) throws BookStoreException;
	List<Book> getAllBooks() throws BookStoreException;
	boolean update(Book book) throws BookStoreException;
}
