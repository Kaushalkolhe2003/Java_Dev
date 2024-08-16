package Java_oops;

 interface PaymentMethod {
    void processPayment(double amount);
}
 
class CreditCard implements PaymentMethod {
	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing credit card payment of $" + amount);
	    }
	}
class DebitCard implements PaymentMethod {
	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing debit card payment of $" + amount);
	    }
	}

class PayPal implements PaymentMethod {
	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Processing PayPal payment of $" + amount);
	    }
	}
class Mobikiwi implements PaymentMethod{
	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Mobikiwi payment of $"+amount);
	}
}

class PaymentProcessor {
    public void makePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}

public class Polymorphism {
	 public static void main(String[] args) {
	        PaymentProcessor processor = new PaymentProcessor();

	        PaymentMethod creditCard = new CreditCard();
	        PaymentMethod debitCard = new DebitCard();
	        PaymentMethod payPal = new PayPal();
	        PaymentMethod mobikiwi= new Mobikiwi();

	        processor.makePayment(creditCard, 100.0);
	        processor.makePayment(debitCard, 50.0);
	        processor.makePayment(payPal, 75.0);
	        processor.makePayment(mobikiwi, 13.0);
	    }

}

/*Polymorphism is a fundamental concept in object-oriented programming that allows 
 * objects of different classes to be treated as objects of a common superclass. 
 * It enables a single interface to represent different underlying forms (data types). 
 * The term "polymorphism" means "many shapes" and it allows one interface to be used
 *  for a general class of actions. The specific action is determined by the exact nature
 *   of the situation.
 * 
 * Real-time Example: Polymorphism in a Payment System
Imagine you are developing a payment system for an online shopping application.
 This system needs to handle various types of payment methods, such as credit cards, debit cards, and PayPal. 
 Each payment method has its own unique way of processing payments. However, the application should be able to 
 process a payment without needing to know the details of each payment method.
 * 
 * 
 * 
 * 
 * Explanation of example
 * Polymorphism allows the PaymentProcessor class to process any type of payment method without needing to know 
 * the specifics of each one. This flexibility makes the system easily extensible. If a new payment method is 
 * introduced (e.g., Bitcoin), you simply create a new class that implements the PaymentMethod interface without
 *  modifying the existing code in the PaymentProcessor class.

This demonstrates the power of polymorphism in real-world applications, enabling code to be more flexible, 
maintainable, and scalable. By abstracting the payment processing logic, you adhere to the Open/Closed Principle, 
one of the SOLID principles of object-oriented design, which states that software entities should be open for 
extension but closed for modification
 * 
 */
