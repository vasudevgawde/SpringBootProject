package com.example.controller;

public class Product {

	int productID;
	String productName;
	float Price;
	
	Product(int pr,String st,float ft)
	{
		this.productID = pr;
		this.productName = st;
		this.Price = ft;
	}
	
	Product()
	{
		//default constructor
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	
}
