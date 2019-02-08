package com.jboss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.dao.AdminDAO;
import com.jboss.pojos.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	//need to inject customer dao
	@Autowired
	public AdminDAO adminDAO;
	@Override
	@Transactional
	public List<Admin> getAdmins() {
		
		return adminDAO.getAdmins();
	}
	@Override
	@Transactional
	public void saveAdmin(Admin theAdmin) {
		// TODO Auto-generated method stub
		adminDAO.saveAdmin(theAdmin);		
	}
	@Override
	@Transactional
	public Admin getAdmin(int theId) {
		// TODO Auto-generated method stub
		
		return adminDAO.getAdmin(theId);
	}
	
	@Override
	@Transactional
	public void deleteAdmin(int theId) {
		
	adminDAO.deleteAdmin(theId);	
	}
	

}

