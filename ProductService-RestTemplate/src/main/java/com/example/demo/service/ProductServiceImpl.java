package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		Product product1 = productRepository.save(product);
		return product1;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = (List<Product>) productRepository.findAll();
		return productList;
	}

	@Override
	public Optional<Product> getProduct(Integer id) {
		Optional<Product> product1 = productRepository.findById(id);
		return product1;
	}

}
