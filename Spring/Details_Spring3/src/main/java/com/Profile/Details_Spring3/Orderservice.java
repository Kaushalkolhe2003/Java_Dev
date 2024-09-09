package com.Profile.Details_Spring3;

public class Orderservice {
	private PaymentService payment ;
	
	
	
	//setter 
	public void setPayment(PaymentService payment) {
		this.payment = payment;
	}



	public void processOrder(String orderId) {
        System.out.println("Processing order: " + orderId);
        payment.processPayment(orderId);
        System.out.println("Order processed successfully.");
    }
    
}
