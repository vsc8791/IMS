package com.bookstore.service;

import java.util.List;

import com.bookstore.entity.*;

public interface CustomerService {

	List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	Customer getCustomer(int theId);
	void deleteCustomer(int theId);

	
}
