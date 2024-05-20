package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private int productQuantity;
	private int Productprice;
	private int TotalPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getProductprice() {
		return Productprice;
	}

	public void setProductprice(int productprice) {
		Productprice = productprice;
	}

	public int getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Cart [productId=" + productId + ", productName=" + productName + ", productQuantity=" + productQuantity
				+ ", Productprice=" + Productprice + ", TotalPrice=" + TotalPrice + "]";
	}

}
