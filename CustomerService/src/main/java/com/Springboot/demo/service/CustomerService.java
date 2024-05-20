package com.Springboot.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.demo.model.Customer;
import com.Springboot.demo.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	public Customer saveCustomerDetails(Customer customer) {

		Customer customer2 = customerRepo.save(customer);
		return customer2;
	}
	
	public  Optional<Customer> getCustomerById(int id) {
//		Optional<Customer> cusOptional = customerRepo.findById(id);	
//		return cusOptional;
		return customerRepo.findById(id);
		
	}

}



























