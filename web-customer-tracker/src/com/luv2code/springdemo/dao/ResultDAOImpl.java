package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Result;

@Repository
public class ResultDAOImpl implements ResultDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Result> getResults() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Result> theQuery=
				currentSession.createQuery("from Result", Result.class);
		//execute the query and get the result
	List<Result> results=theQuery.getResultList();		
		// return the results		
		return results;
	}

	@Override
	public void saveResult(Result theResult) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theResult);
	}

	@Override
	public Result getResult(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Result theResult = currentSession.get(Result.class, theId);
		
		 
		return theResult;
	}

	@Override
	public void deleteResult(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Result where id=:resultId");
		theQuery.setParameter("resultId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}