package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Schedule;

@Repository
public class ScheduleDAOImpl implements ScheduleDAO {

	
	//need to inject the session factory
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Schedule> getSchedules() {
		//get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
		// create Query
		Query<Schedule> theQuery=
				currentSession.createQuery("from Schedule", Schedule.class);
		//execute the query and get the result
	List<Schedule> schedules=theQuery.getResultList();		
		// return the results		
		return schedules;
	}

	@Override
	public void saveSchedule(Schedule theSchedule) {
		//get current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer .. finally LOL
		currentSession.saveOrUpdate(theSchedule);
	}

	@Override
	public Schedule getSchedule(int theId) {

		
		//get the current hibernate session
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		//now retrieve/read from database using the primary key
		Schedule theSchedule = currentSession.get(Schedule.class, theId);
		
		 
		return theSchedule;
	}

	@Override
	public void deleteSchedule(int theId) {
		//get the current session of hibernate
		Session currentSession = sessionFactory.getCurrentSession();
		//delete the object with primary key
		
		@SuppressWarnings("rawtypes")
		Query theQuery=currentSession.createQuery("delete from Schedule where id=:scheduleId");
		theQuery.setParameter("scheduleId", theId);
		
		theQuery.executeUpdate();
				
	}

	

}
