package com.kosa.myapp.in;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
	
	List<Customer> custList=new ArrayList<>();
	

	@Override
	public void insertCustomer(Customer customer) {
		custList.add(customer);

	}

	@Override
	public Customer getCustomer(int index) {
		return custList.get(index);
	}

	@Override
	public void updateCustomer(int index, Customer customer) {
		custList.set(index, customer);

	}

	@Override
	public void deleteCustomer(int index) {
		custList.remove(index);

	}

}
