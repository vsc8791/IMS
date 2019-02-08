package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dao.BookDAO;
import com.bookstore.entity.Book;
@Service
public class BookServiceImpl implements BookService {

	//need to inject customer dao
	@Autowired
	public BookDAO customerDAO;
	@Override
	@Transactional
	public List<Book> getBooks() {
		
		return customerDAO.getBooks();
	}
	
	@Override
	@Transactional
	public void saveBook(Book theBook) {
		// TODO Auto-generated method stub
		customerDAO.saveBook(theBook);		
	}
	
	@Override
	@Transactional
	public Book getBook(int theId) {
		// TODO Auto-generated method stub
		
		return customerDAO.getBook(theId);
	}
	
	@Override
	@Transactional
	public void deleteBook(int theId) {
		
	customerDAO.deleteBook(theId);	
	}
	

}
