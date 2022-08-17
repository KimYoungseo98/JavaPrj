package com.kosa.myapp.in;

public interface ICustomerService {
	void insertCustomer(Customer customer);
	Customer getCustomer(int index);
	void updateCustomer(int index, Customer customer);
	void deleteCustomer(int index);
	
	

}
