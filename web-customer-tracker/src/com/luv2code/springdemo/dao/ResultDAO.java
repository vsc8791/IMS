package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Result;

public interface ResultDAO {
	public List<Result> getResults();
	public void saveResult(Result theResult);
	public Result getResult(int theId);
	public void deleteResult(int theId);
}
