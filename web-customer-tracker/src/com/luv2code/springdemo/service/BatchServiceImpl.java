package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.BatchDAO;
import com.luv2code.springdemo.entity.Batch;
@Service
public class BatchServiceImpl implements BatchService {

	//need to inject customer dao
	@Autowired
	public BatchDAO batchDAO;
	@Override
	@Transactional
	public List<Batch> getBatchs() {
		
		return batchDAO.getBatchs();
	}
	@Override
	@Transactional
	public void saveBatch(Batch theBatch) {
		// TODO Auto-generated method stub
		batchDAO.saveBatch(theBatch);		
	}
	@Override
	@Transactional
	public Batch getBatch(int theId) {
		// TODO Auto-generated method stub
		
		return batchDAO.getBatch(theId);
	}
	
	@Override
	@Transactional
	public void deleteBatch(int theId) {
		
	batchDAO.deleteBatch(theId);	
	}
	

}

