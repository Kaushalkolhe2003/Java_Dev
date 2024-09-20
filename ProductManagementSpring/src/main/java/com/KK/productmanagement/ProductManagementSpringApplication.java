package com.KK.productmanagement;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductManagementSpringApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(ProductManagementSpringApplication.class, args);
		ProductService ps =context.getBean(ProductService.class);
	
	List<Product> products=ps.getProduct();
  	  for(Product p : products)
   	  {
   		  System.out.println(p);
   
   	  }
	 }

}
 