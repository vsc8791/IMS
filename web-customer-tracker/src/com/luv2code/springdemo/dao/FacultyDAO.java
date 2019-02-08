package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Faculty;

public interface FacultyDAO {
	public List<Faculty> getFacultys();
	public void saveFaculty(Faculty theFaculty);
	public Faculty getFaculty(int theId);
	public void deleteFaculty(int theId);

}
