package com.example.controller;

import java.util.ArrayList;

public interface CartManagerInterface {
	public void addToCart(int id);
	public ArrayList<Product> getAllCartProducts();
	
}
