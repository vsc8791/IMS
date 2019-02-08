package com.jboss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.dao.UserDAO;
import com.jboss.pojos.User;

@Service
public class UserServiceImpl implements UserService {

	//need to inject customer dao
	@Autowired
	public UserDAO userDAO;
	@Override
	@Transactional
	public List<User> getUsers() {
		
		return userDAO.getUsers();
	}
	@Override
	@Transactional
	public void saveUser(User theUser) {
		// TODO Auto-generated method stub
		userDAO.saveUser(theUser);		
	}
	@Override
	@Transactional
	public User getUser(int theId) {
		// TODO Auto-generated method stub
		
		return userDAO.getUser(theId);
	}
	
	@Override
	@Transactional
	public void deleteUser(int theId) {
		
	userDAO.deleteUser(theId);	
	}
	

}

