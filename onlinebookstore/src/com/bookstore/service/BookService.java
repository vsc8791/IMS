package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.Book;

public interface BookService {
	List<Book> getBooks();
	public void saveBook(Book theBook);
	Book getBook(int theId);
	void deleteBook(int theId);

}
