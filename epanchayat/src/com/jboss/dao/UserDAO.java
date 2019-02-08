package com.jboss.dao;

import java.util.List;

import com.jboss.pojos.User;

public interface UserDAO {
	public List<User> getUsers();
	public void saveUser(User theUser);
	public User getUser(int theId);
	public void deleteUser(int theId);
	

}
