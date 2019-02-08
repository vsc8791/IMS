package com.jboss.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jboss.pojos.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Admin> getAdmins() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Admin> theQuery=
				currentSession.createQuery("from Admin", Admin.class);
		//execute the query and get the result
	List<Admin> admins=theQuery.getResultList();		
		// return the results		
		return admins;
	}

	@Override
	public void saveAdmin(Admin theAdmin) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theAdmin);
	}

	@Override
	public Admin getAdmin(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Admin theAdmin = currentSession.get(Admin.class, theId);
		
		 
		return theAdmin;
	}

	@Override
	public void deleteAdmin(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Admin where id=:adminId");
		theQuery.setParameter("adminId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}
