package com.jboss.service;
import com.jboss.pojos.*;

import java.util.List;

public interface UserService {
	public List<User> getUsers();
	public void saveUser(User theUser);
	public User getUser(int theId);
	public void deleteUser(int theId);
}
