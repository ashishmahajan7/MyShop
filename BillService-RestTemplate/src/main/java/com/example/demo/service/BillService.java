package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Bill;



public interface BillService {
	
	public Bill saveBill(Bill product);
	
	public List<Bill> getAllbills();
	
	public Optional<Bill> getBill(Integer id) ;
	

}
