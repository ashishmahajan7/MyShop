package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	public Optional<Product> findById(Integer id);


}
