package com.Payment.Ecommerce_Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        OrderService orderservice =(OrderService) context.getBean("orderService");
        orderservice.placeOrder();
    }
}
