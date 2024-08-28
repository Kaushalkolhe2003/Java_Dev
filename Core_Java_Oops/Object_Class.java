package Java_oops;
class Laptop{
	 String model;
	 int price;
	 
	 public String toString() {
		 return model+" "+price;
	 }
	 public boolean equals(Laptop that) {
		 return this.model.equals(that.model) && this.price==that.price;
			
		 
		 
	 }
	
}
public class Object_Class {
	public static void main(String a[]) {
		Laptop d = new Laptop();
		d.model="Acer Aspire 3";
		d.price=50000;
		System.out.println(d);
		
		Laptop d1 = new Laptop();
		d1.model="Acer Aspire 5";
		d1.price=50000;
		boolean result=d.equals(d1);
		System.out.println(result);
		
	}
}
//obj default behind the scene call tostring method..
//even if you dont memtion
