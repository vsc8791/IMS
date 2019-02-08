package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ResultDAO;
import com.luv2code.springdemo.entity.Result;
@Service
public class ResultServiceImpl implements ResultService {

	//need to inject customer dao
	@Autowired
	public ResultDAO resultDAO;
	@Override
	@Transactional
	public List<Result> getResults() {
		
		return resultDAO.getResults();
	}
	@Override
	@Transactional
	public void saveResult(Result theResult) {
		// TODO Auto-generated method stub
		resultDAO.saveResult(theResult);		
	}
	@Override
	@Transactional
	public Result getResult(int theId) {
		// TODO Auto-generated method stub
		
		return resultDAO.getResult(theId);
	}
	
	@Override
	@Transactional
	public void deleteResult(int theId) {
		
	resultDAO.deleteResult(theId);	
	}
	

}

