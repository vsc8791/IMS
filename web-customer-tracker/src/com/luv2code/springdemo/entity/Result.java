package com.luv2code.springdemo.entity;

import javax.persistence.*;


@Entity
@Table(name="result")
public class Result {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="resultName")
    private String resultName;

	
	@Column(name="result_subject")
	private String result_subject;
	
	@Column(name="result_status")
	private String result_status;
	
	@Column(name="result_description")
	private String result_description;
	
	@Column(name="passing_marks")
	private int passing_marks;
	
	@Column(name="total_marks")
	private int total_marks;
	
	@Column(name="result_type")
	private String result_type;
	
	
public Result() {
	// TODO Auto-generated constructor stub
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getResultName() {
	return resultName;
}


public void setResultName(String resultName) {
	this.resultName = resultName;
}


public String getResult_subject() {
	return result_subject;
}


public void setResult_subject(String result_subject) {
	this.result_subject = result_subject;
}


public String getResult_status() {
	return result_status;
}


public void setResult_status(String result_status) {
	this.result_status = result_status;
}


public String getResult_description() {
	return result_description;
}


public void setResult_description(String result_description) {
	this.result_description = result_description;
}


public int getPassing_marks() {
	return passing_marks;
}


public void setPassing_marks(int passing_marks) {
	this.passing_marks = passing_marks;
}


public int getTotal_marks() {
	return total_marks;
}


public void setTotal_marks(int total_marks) {
	this.total_marks = total_marks;
}


public String getResult_type() {
	return result_type;
}


public void setResult_type(String result_type) {
	this.result_type = result_type;
}



	
	
	
}
