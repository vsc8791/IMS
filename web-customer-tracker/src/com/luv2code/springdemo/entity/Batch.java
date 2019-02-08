package com.luv2code.springdemo.entity;

import javax.persistence.*;
@Entity
@Table(name="batch")
public class Batch {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="batchName")
	private String batchName;
	
	@Column(name="batchYear")
	private int batchYear;
	
	@Column(name="no_of_students")
	private int no_of_students;
	
	@Column(name="status")
	private String  status;
	
	@Column(name="placement_percentage")
	private float placement_percentage;
	
	
	
	public Batch() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getBatchName() {
		return batchName;
	}



	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}



	public int getBatchYear() {
		return batchYear;
	}



	public void setBatchYear(int batchYear) {
		this.batchYear = batchYear;
	}



	public int getNo_of_students() {
		return no_of_students;
	}



	public void setNo_of_students(int no_of_students) {
		this.no_of_students = no_of_students;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public float getPlacement_percentage() {
		return placement_percentage;
	}



	public void setPlacement_percentage(float placement_percentage) {
		this.placement_percentage = placement_percentage;
	}
	
	
	
}
