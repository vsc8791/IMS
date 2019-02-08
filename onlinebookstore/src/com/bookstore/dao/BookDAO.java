package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Book;


	public interface BookDAO {
		List<Book> getBooks();
		public void saveBook(Book theBook);
		Book getBook(int theId);
		void deleteBook(int theId);
}
