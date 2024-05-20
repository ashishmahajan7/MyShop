package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart saveCart(Cart cart) {
		Cart cart2 = cartRepository.save(cart);
		return cart2;
	}

	@Override
	public List<Cart> getAllProducts() {
		List<Cart> cartlist = (List<Cart>) cartRepository.findAll();
		return cartlist;
	}

	@Override
	public Optional<Cart> getProductById(int id) {
		Optional<Cart> cart = cartRepository.findById(id);
		return cart;
	}

}
