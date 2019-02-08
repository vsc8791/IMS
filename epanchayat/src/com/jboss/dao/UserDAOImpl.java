package com.jboss.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jboss.pojos.User;

@Repository
public class UserDAOImpl implements UserDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<User> getUsers() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<User> theQuery=
				currentSession.createQuery("from User", User.class);
		//execute the query and get the result
	List<User> users=theQuery.getResultList();		
		// return the results		
		return users;
	}

	@Override
	public void saveUser(User theUser) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theUser);
	}

	@Override
	public User getUser(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		User theUser = currentSession.get(User.class, theId);
		
		 
		return theUser;
	}

	@Override
	public void deleteUser(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from User where id=:userId");
		theQuery.setParameter("userId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}
