package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="rollNumber")
	private int rollNumber;
	
	
	@Column(name="prnNumber")
	private long prnNumber;
	
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact")
	private long contact;
	
	@Column(name="course_enrolled")
	private String course_enrolled;
	
	@Column(name="aggregate")
	private double aggregate;
	
	@Column(name="password")
    private String password;
	
	@Column(name="degree_course")
	private String degree_course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public long getPrnNumber() {
		return prnNumber;
	}

	public void setPrnNumber(long prnNumber) {
		this.prnNumber = prnNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getCourse_enrolled() {
		return course_enrolled;
	}

	public void setCourse_enrolled(String course_enrolled) {
		this.course_enrolled = course_enrolled;
	}

	public double getAggregate() {
		return aggregate;
	}

	public void setAggregate(double aggregate) {
		this.aggregate = aggregate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDegree_course() {
		return degree_course;
	}

	public void setDegree_course(String degree_course) {
		this.degree_course = degree_course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNumber=" + rollNumber + ", prnNumber=" + prnNumber + ", studentName="
				+ studentName + ", email=" + email + ", contact=" + contact + ", course_enrolled=" + course_enrolled
				+ ", aggregate=" + aggregate + ", password=" + password + ", degree_course=" + degree_course + "]";
	}
	
	
	
	
}