package Java_oops;

class Mobile1{
	String brand;
	int price;
	  String name;
	
	public void show() {
		System.out.println(brand+ " : "+price+" : "+name);
	}
	public static void show1(Mobile1 obj) {
		System.out.println("Your brand is "+obj.brand);
		System.out.println("Your price is "+obj.price);
		System.out.println("Your name  is "+obj.name);
	}
}
public class Static_method {

	public static void main(String[] args) {
		 Mobile1 m1= new Mobile1();
		 m1.name="kaushal";
		 m1.price=12000;
		 m1.brand="samsung";
		 
		 Mobile1 m2= new Mobile1();
		 m2.name="yash";
		 m2.price=14000;
		 m2.brand="iphone";
		 
		
	  
		 m1.show();
		 m2.show();
		 Mobile1.show1(m1);
		 

	}

}
/*->we can use static variable in  static method 
 ->we  cannt use non static vara ible in static method
why??
->as here brand and price are instant varible   it will be differnt 
for different obj  when we call mobile1.show1() it will confuse which
which object u refering too.

we can do indirectly by pasing specific objet to that 
method

why the main method is static?
->
*/

