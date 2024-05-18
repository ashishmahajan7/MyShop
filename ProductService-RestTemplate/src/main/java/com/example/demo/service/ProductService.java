package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Product;


public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Optional<Product> getProduct(Integer id);
	
	public void deleteProduct(int id);
	
	public Product updateAllInformationOfProduct(int id , Product product);
	
	public Product updateSpecifiedInformation(int id , Product product);
	

}
