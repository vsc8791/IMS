package com.jboss.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jboss.pojos.DeathDetails;

@Repository
public class DeathDetailsDAOImpl implements DeathDetailsDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<DeathDetails> getDeathDetailss() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<DeathDetails> theQuery=
				currentSession.createQuery("from DeathDetails", DeathDetails.class);
		//execute the query and get the result
	List<DeathDetails> deathDetailss=theQuery.getResultList();		
		// return the results		
		return deathDetailss;
	}

	@Override
	public void saveDeathDetails(DeathDetails theDeathDetails) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theDeathDetails);
	}

	@Override
	public DeathDetails getDeathDetails(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		DeathDetails theDeathDetails = currentSession.get(DeathDetails.class, theId);
		
		 
		return theDeathDetails;
	}

	@Override
	public void deleteDeathDetails(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from DeathDetails where id=:deathDetailsId");
		theQuery.setParameter("deathDetailsId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}