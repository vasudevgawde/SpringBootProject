package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration

@RestController
public class ProductManager {

	
	
	@Autowired
	ProductManagerServiceInterface in;
	@Autowired
	CartManagerInterface c;
	@ResponseBody
	@RequestMapping("/")
	String entry()
	{
		return "My first Boot App";	
	}
	
	@RequestMapping("/products")
	public HashMap<Integer,Product> getAllProducts()
	{
		return in.getAllProducts();
	}

	@RequestMapping("/product/{proID}")
	public Product getProduct(@PathVariable int proID)
	{
		//return productmap.get(proID);
		return in.getProdByID(proID);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/product/{notificationMethod}" )
	public void insertProduct(@RequestBody Product prod,String notificationMethod)
	{
		//productmap.put(prod.productID, prod);
		in.addProduct(prod);
		in.sendNotification(notificationMethod);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/product/{proID}" )
	public void deleteProduct(@PathVariable int proID)
	{
		//productmap.remove(proID);
		in.removeProd(proID);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/product/{id}")
	public void updateProduct(@PathVariable int id,@RequestBody Product prod)
	{
		in.updateProd(id, prod);
	}
	@RequestMapping(method=RequestMethod.POST, value="/cart/product/{id}")
	public void addProductToCart(@PathVariable int id)
	{
		c.addToCart(id);
	}
	
	@RequestMapping("cart/products")
	public ArrayList<Product> getAllCartProducts()
	{
		return c.getAllCartProducts();
	}

	
}
