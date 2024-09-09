package com.Profile.Details_Spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context=  new ClassPathXmlApplicationContext("spring.xml");
        
        Orderservice order_service= (Orderservice) context.getBean("order");
        
        order_service.processOrder("ORDER12345");
    }
} 
