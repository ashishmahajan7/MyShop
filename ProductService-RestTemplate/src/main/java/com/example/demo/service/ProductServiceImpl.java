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

	@Override
	public void deleteProduct(int id) {
		 productRepository.deleteById(id);
	}

	@Override
	public Product updateAllInformationOfProduct(int id, Product updatedProduct) {
		Optional<Product> oldProduct = productRepository.findById(id);
	
		if(oldProduct.isPresent()) {
			Product product = oldProduct.get();
			product.setProductId(updatedProduct.getProductId());
			product.setProductName(updatedProduct.getProductName());
			product.setAvailableQuantity(updatedProduct.getAvailableQuantity());
			product.setProductDiscription(updatedProduct.getProductDiscription());
//			product.setPrice(updatedProduct.getPrice());
			return productRepository.save(product);
		}
		else {
			throw new RuntimeException("Product not Found");
		}
		
	}

	@Override
	public Product updateSpecifiedInformation(int id, Product updatedProduct) {
		Optional<Product> oldProduct = productRepository.findById(id);
		
		if(oldProduct.isPresent()) {
			Product product = oldProduct.get();
			if(updatedProduct.getProductId() != 0) {
				product.setProductId(updatedProduct.getProductId());
			}
			if(updatedProduct.getProductName() != null) {
				product.setProductName(updatedProduct.getProductName());
			}
			if(updatedProduct.getProductDiscription() != null) {
				product.setProductDiscription(updatedProduct.getProductDiscription());
			}
			if(updatedProduct.getAvailableQuantity() != 0) {
				product.setAvailableQuantity(updatedProduct.getAvailableQuantity());
			}
			if(updatedProduct.getPrice() != 0) {
				product.setPrice(updatedProduct.getPrice());
			}
			return productRepository.save(product);
		}
		else {
			throw new RuntimeException("Product not found");
		}
	}

}
