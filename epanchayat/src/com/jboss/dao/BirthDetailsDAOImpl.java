package com.jboss.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jboss.pojos.BirthDetails;

@Repository
public class BirthDetailsDAOImpl implements BirthDetailsDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<BirthDetails> getBirthDetailss() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<BirthDetails> theQuery=
				currentSession.createQuery("from BirthDetails", BirthDetails.class);
		//execute the query and get the result
	List<BirthDetails> birthDetailss=theQuery.getResultList();		
		// return the results		
		return birthDetailss;
	}

	@Override
	public void saveBirthDetails(BirthDetails theBirthDetails) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theBirthDetails);
	}

	@Override
	public BirthDetails getBirthDetails(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		BirthDetails theBirthDetails = currentSession.get(BirthDetails.class, theId);
		
		 
		return theBirthDetails;
	}

	@Override
	public void deleteBirthDetails(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from BirthDetails where id=:birthDetailsId");
		theQuery.setParameter("birthDetailsId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}
