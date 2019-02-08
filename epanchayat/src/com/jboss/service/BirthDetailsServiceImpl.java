package com.jboss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.dao.BirthDetailsDAO;
import com.jboss.pojos.BirthDetails;

@Service
public class BirthDetailsServiceImpl implements BirthDetailsService {

	//need to inject customer dao
	@Autowired
	public BirthDetailsDAO birthDetailsDAO;
	@Override
	@Transactional
	public List<BirthDetails> getBirthDetailss() {
		
		return birthDetailsDAO.getBirthDetailss();
	}
	@Override
	@Transactional
	public void saveBirthDetails(BirthDetails theBirthDetails) {
		// TODO Auto-generated method stub
		birthDetailsDAO.saveBirthDetails(theBirthDetails);		
	}
	@Override
	@Transactional
	public BirthDetails getBirthDetails(int theId) {
		// TODO Auto-generated method stub
		
		return birthDetailsDAO.getBirthDetails(theId);
	}
	
	@Override
	@Transactional
	public void deleteBirthDetails(int theId) {
		
	birthDetailsDAO.deleteBirthDetails(theId);	
	}
	

}

