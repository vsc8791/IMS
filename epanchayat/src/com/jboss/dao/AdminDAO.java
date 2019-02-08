package com.jboss.dao;

import java.util.List;

import com.jboss.pojos.Admin;

public interface AdminDAO {
	public List<Admin> getAdmins();
	public void saveAdmin(Admin theAdmin);
	public Admin getAdmin(int theId);
	public void deleteAdmin(int theId);
}
