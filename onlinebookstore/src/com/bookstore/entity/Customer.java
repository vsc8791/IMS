package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer1")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="username")
	private String username;
	
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private String pincode;
	
	
public Customer() {
	// TODO Auto-generated constructor stub
}




	public String getFirstname() {
	return firstname;
}




public void setFirstname(String firstname) {
	this.firstname = firstname;
}




public String getLastname() {
	return lastname;
}




public void setLastname(String lastname) {
	this.lastname = lastname;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	

}
