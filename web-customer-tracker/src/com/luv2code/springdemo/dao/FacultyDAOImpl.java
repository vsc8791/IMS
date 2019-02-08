package com.luv2code.springdemo.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springdemo.entity.Faculty;

@Repository
public class FacultyDAOImpl implements FacultyDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Faculty> getFacultys() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Faculty> theQuery=
				currentSession.createQuery("from Faculty", Faculty.class);
		//execute the query and get the result
	List<Faculty> facultys=theQuery.getResultList();		
		// return the results		
		return facultys;
	}

	@Override
	public void saveFaculty(Faculty theFaculty) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theFaculty);
	}

	@Override
	public Faculty getFaculty(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Faculty theFaculty = currentSession.get(Faculty.class, theId);
		
		 
		return theFaculty;
	}

	@Override
	public void deleteFaculty(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Faculty where id=:facultyId");
		theQuery.setParameter("facultyId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}