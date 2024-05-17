package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bill;
import com.example.demo.repository.BillRepository;



@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill saveBill(Bill bill) {
		Bill bill1 = billRepository.save(bill);
		return bill1;
	}

	@Override
	public List<Bill> getAllbills() {
		List<Bill> billList = (List<Bill>) billRepository.findAll();
		return billList;
	}

	@Override
	public Optional<Bill> getBill(Integer id) {
		Optional<Bill> bill1 = billRepository.findById(id);
		return bill1;
	}

}
