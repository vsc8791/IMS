package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Student;

public interface StudentDAO {
	public List<Student> getStudents();
	public void saveStudent(Student theStudent);
	public Student getStudent(int theId);
	public void deleteStudent(int theId);
}
