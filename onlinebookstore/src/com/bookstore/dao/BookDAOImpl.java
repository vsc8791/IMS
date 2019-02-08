package com.bookstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.bookstore.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Book> getBooks() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Book> theQuery=
				currentSession.createQuery("from Book", Book.class);
		//execute the query and get the result
	List<Book> customers=theQuery.getResultList();		
		// return the results		
		return customers;
	}

	@Override
	public void saveBook(Book theBook) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theBook);
	}

	@Override
	public Book getBook(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Book theBook = currentSession.get(Book.class, theId);
		
		 
		return theBook;
	}

	@Override
	public void deleteBook(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Book where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}