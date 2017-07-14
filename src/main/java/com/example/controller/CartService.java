package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartService implements CartManagerInterface{
	
ArrayList<Product> cartAlist;

CartService()
{
	cartAlist = new ArrayList<Product>();
}

@Autowired
ProductManagerService p;

public void addToCart(int id)
{
	if(p.myHash.containsKey(id))
	{
		
		cartAlist.add(p.myHash.get(id));
	}
}

public ArrayList<Product> getAllCartProducts()
{
	return cartAlist;
	
}

}
