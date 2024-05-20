package com.Springboot.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.demo.model.Customer;
import com.Springboot.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/savecustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		Customer customer1 = customerService.saveCustomerDetails(customer);
		return ResponseEntity.ok().body(customer1);
	}

	@GetMapping("/getcustomerbyid/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable("id") int id) {
		Optional<Customer> customer = customerService.getCustomerById(id);
		return ResponseEntity.ok().body(customer);
	}

}
