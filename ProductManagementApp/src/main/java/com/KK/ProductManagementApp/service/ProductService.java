package com.KK.ProductManagementApp.service;
import com.KK.ProductManagementApp.DB.*;
import java.util.ArrayList;
import java.util.List;

import com.KK.ProductManagementApp.DB.productDB;
import com.KK.ProductManagementApp.model.Product;

public class ProductService 
{
	productDB db=new productDB();
	
	public void addProduct(Product p)
	{
		db.save(p);
		System.out.println("Added successfully");
	}

	public List<Product> getProduct() {
		List<Product> products=db.getProducts();
		return products;
		
	}

	public Product getProductByName(String str) {
	Product p= db.getProductByName(str);
	return p;
	}
}
