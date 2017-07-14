package com.example.controller;

import java.util.HashMap;

public interface ProductManagerServiceInterface {
	public HashMap<Integer,Product> getAllProducts();
	
	public Product getProdByID(int id);
	
	
	public void addProduct(Product prod);
	
	
	public void removeProd(int proID);
	
	public void updateProd(int ID,Product prod);
	
	
	public void sendNotification(String noti);
	
}
