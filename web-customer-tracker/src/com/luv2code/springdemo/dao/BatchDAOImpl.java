package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Batch;

@Repository
public class BatchDAOImpl implements BatchDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Batch> getBatchs() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Batch> theQuery=
				currentSession.createQuery("from Batch", Batch.class);
		//execute the query and get the result
	List<Batch> batchs=theQuery.getResultList();		
		// return the results		
		return batchs;
	}

	@Override
	public void saveBatch(Batch theBatch) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theBatch);
	}

	@Override
	public Batch getBatch(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Batch theBatch = currentSession.get(Batch.class, theId);
		
		 
		return theBatch;
	}

	@Override
	public void deleteBatch(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Batch where id=:batchId");
		theQuery.setParameter("batchId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}
