package com.Payment.Ecommerce_Primary;

public class CreditCardPaymentService implements PaymentService {
	
	public void processPayment() {
		System.out.println("Processing payment by credit card...");
		System.out.println("Thank you for using credit card");
	}
}
