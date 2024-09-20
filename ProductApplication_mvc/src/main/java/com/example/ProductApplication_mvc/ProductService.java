package com.example.ProductApplication_mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService 
{
	@Autowired
	ProductDB db;
	public void addProduct(Product p)
	{
		db.save(p);
		System.out.println("Added successfully");
	}
//
	public List<Product> getProduct() {
		List<Product> products=db.findAll();
		return products;
		
	}
//
	public Product getProductByName(String str) {
		return db.findByName(str);
	
	}

	public Product getProductById(int id) {
        return db.findById(id).orElseThrow(); 
    }
	
}
