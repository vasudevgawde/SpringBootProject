package com.example.controller;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class ProductManagerService implements ProductManagerServiceInterface {

	 HashMap<Integer,Product> myHash = new HashMap<Integer,Product>();

	public HashMap<Integer,Product> getAllProducts()
	{
		return myHash;
		
	}
	public Product getProdByID(int id)
	{
		return myHash.get(id);
	}
	
	public void addProduct(Product prod)
	{
		myHash.put(prod.productID, prod);
	}
	
	public void removeProd(int proID)
	{
		myHash.remove(proID);
	}
	public void updateProd(int ID,Product prod)
	{
		myHash.remove(ID);
		myHash.put(ID, prod);
	}
	
	public void sendNotification(String noti)
	{
		NotificationInterface n;
		if(noti =="SMS")
			 n = new SMSnotification();
		else if(noti == "EMAIL")
			 n = new EmailNotification();
	}
}
