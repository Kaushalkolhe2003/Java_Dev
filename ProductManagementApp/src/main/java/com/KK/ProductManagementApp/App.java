package com.KK.ProductManagementApp;

import java.util.List;

import com.KK.ProductManagementApp.model.Product;
import com.KK.ProductManagementApp.service.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ProductService ps= new ProductService();
      
      // ps.addProduct( new Product("Lenovo","Laptop","Brown Table",2020));
        ps.addProduct( new Product("HP","Laptop","Black Table",2019));
//        ps.addProduct( new Product("Dell","Laptop","White Table",2021));
//        ps.addProduct( new Product("Asus","Laptop","Black Table",2022));
//        ps.addProduct( new Product("Acer","Laptop","Brown Table",2023));
    	
//    	List<Product> products=ps.getProduct();
//    	
//    	for(Product p : products)
//    	{
//    		System.out.println(p);
//    	}
    	
//    	String name="Acer";
//    	Product p=ps.getProductByName(name);
//    	System.out.println(p);
    	
    }
}
