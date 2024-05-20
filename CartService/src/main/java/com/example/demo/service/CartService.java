package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Cart;



public interface CartService {

	public Cart saveCart(Cart cart);
	
	public List<Cart> getAllProducts();
	
	public Optional<Cart> getProductById(int id);
	
}
