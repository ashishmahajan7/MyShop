package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer>{
	
	public Optional<Bill> findById(Integer id);

}
