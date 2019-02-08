package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.StudentDAO;
import com.luv2code.springdemo.entity.Student;
@Service

public class StudentServiceImpl implements StudentService {

	//need to inject customer dao
		@Autowired
		public StudentDAO studentDAO;
		
	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		// TODO Auto-generated method stub
        studentDAO.saveStudent(theStudent);
	}

	@Override
	@Transactional
	public Student getStudent(int theId) {
		// TODO Auto-generated method stub
		return studentDAO.getStudent(theId);
	}

	@Override
	@Transactional

	public void deleteStudent(int theId) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(theId);

	}

}
