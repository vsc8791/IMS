package com.jboss.dao;

import java.util.List;

import com.jboss.pojos.BirthDetails;

public interface BirthDetailsDAO {
	public List<BirthDetails> getBirthDetailss();
	public void saveBirthDetails(BirthDetails theBirthDetails);
	public BirthDetails getBirthDetails(int theId);
	public void deleteBirthDetails(int theId);
}
