package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Customer> theQuery=
				currentSession.createQuery("from Customer order by lastName", Customer.class);
		//execute the query and get the result
	List<Customer> customers=theQuery.getResultList();		
		// return the results		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
		 
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}
