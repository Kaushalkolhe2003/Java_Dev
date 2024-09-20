package com.example.ProductApplication_mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService ps ;
	//this is for product request 
	@GetMapping("/products")
	 public List<Product> getAllProducts(){
		 return ps.getProduct();
	 }
	@GetMapping("/product/{name}")
	public Product getProduct( @PathVariable String name) {
		return ps.getProductByName(name);
	}
	//using id
	@GetMapping("/productid/{id}")
	public Product getProductID( @PathVariable int id) {
		return ps.getProductById(id);
	}
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p) {
		ps.addProduct(p);
	}
}
