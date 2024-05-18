package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody Product product) {
		Product product1 = productService.saveProduct(product);
		return product1;
	}
	
	
	@GetMapping("/getallproduct")
	public List<Product> getAllProducts(){
		List<Product> produList = productService.getAllProducts();
		return produList;
	}
	
	@GetMapping("/getproduct/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		Optional<Product> product = productService.getProduct(id);
		return product;
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public void deleteProductById(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
	@PutMapping("/updateproduct/{id}")
	public Product updateAllProductItems(@PathVariable int id , @RequestBody Product product) {
		Product product2 = productService.updateAllInformationOfProduct(id, product);
		return product2;
	}
    
	@PatchMapping("/updatespecifiedinformation/{id}")
	public Product updateSpecifiedInformation(@PathVariable int id,@RequestBody Product updatedProduct) {
		Product product = productService.updateSpecifiedInformation(id, updatedProduct);
		return product;
	}
}
