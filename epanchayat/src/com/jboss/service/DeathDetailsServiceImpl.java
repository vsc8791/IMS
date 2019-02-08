package com.jboss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jboss.dao.DeathDetailsDAO;
import com.jboss.pojos.DeathDetails;

@Service
public class DeathDetailsServiceImpl implements DeathDetailsService {

	//need to inject customer dao
	@Autowired
	public DeathDetailsDAO deathDetailsDAO;
	@Override
	@Transactional
	public List<DeathDetails> getDeathDetailss() {
		
		return deathDetailsDAO.getDeathDetailss();
	}
	@Override
	@Transactional
	public void saveDeathDetails(DeathDetails theDeathDetails) {
		// TODO Auto-generated method stub
		deathDetailsDAO.saveDeathDetails(theDeathDetails);		
	}
	@Override
	@Transactional
	public DeathDetails getDeathDetails(int theId) {
		// TODO Auto-generated method stub
		
		return deathDetailsDAO.getDeathDetails(theId);
	}
	
	@Override
	@Transactional
	public void deleteDeathDetails(int theId) {
		
	deathDetailsDAO.deleteDeathDetails(theId);	
	}
	

}

