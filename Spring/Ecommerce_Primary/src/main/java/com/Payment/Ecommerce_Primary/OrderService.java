package com.Payment.Ecommerce_Primary;

public class OrderService {
	  private PaymentService paymentService;

	    // Constructor-based dependency injection
	    public OrderService(PaymentService paymentService) {
	        this.paymentService = paymentService;
	    }

	    public void placeOrder() {
	        System.out.println("Placing order...");
	        paymentService.processPayment();
	        System.out.println("Order placed successfully.");
	    }
}
