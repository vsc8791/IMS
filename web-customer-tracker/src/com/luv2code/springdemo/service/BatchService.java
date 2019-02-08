package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Batch;

public interface BatchService {

	public List<Batch> getBatchs();
	public void saveBatch(Batch theBatch);
	public Batch getBatch(int theId);
	public void deleteBatch(int theId);
	
}
