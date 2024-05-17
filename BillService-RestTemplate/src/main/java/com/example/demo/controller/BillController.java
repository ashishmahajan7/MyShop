package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bill;
import com.example.demo.service.BillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService productService;
	
	@PostMapping("/savebill")
	public Bill saveBill(@RequestBody Bill bill) {
		Bill bill1 = productService.saveBill(bill);
		return bill1;
	}
	
	
	@GetMapping("/getallbill")
	public List<Bill> getAllBills(){
		List<Bill> billList = productService.getAllbills();
		return billList;
	}
	
	@GetMapping("/getbill/{id}")
	public Optional<Bill> getBill(@PathVariable int id) {
		Optional<Bill> bill = productService.getBill(id);
		return bill;
	}

}
