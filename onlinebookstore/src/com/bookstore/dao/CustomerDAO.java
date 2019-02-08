package com.bookstore.dao;

import java.util.List;

import com.bookstore.entity.Customer;

public interface CustomerDAO {
	List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	Customer getCustomer(int theId);
	void deleteCustomer(int theId);

}
