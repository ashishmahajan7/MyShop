package com.example.demo.CONTROLLER;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	public CartService cartservice;
	@PostMapping("/savecart")
	public Cart saveAdmin(@RequestBody Cart cart) {
		Cart cart2 = cartservice.saveCart(cart);
		return cart2;
	}
	
	@GetMapping("/getallProduct")
	public List<Cart> getAllAdmin(){
		List<Cart> cartlist = cartservice.getAllProducts();
		return cartlist;
	}
	
	@GetMapping("/getProduct/{id}")
	public Optional<Cart> getAdminById(@PathVariable int id){
		Optional<Cart> cart = cartservice.getProductById(id);
		return cart;
}
}