package Java_oops;
class Phone{
	 String brand;
	 int price;
	static String name;
	
	static {
		name ="Phone1";
		System.out.println("Statc block is called");
		
	}
	
	public Phone() {
		brand="";
		price=2000;
		
	}
	
	public void show() {
		System.out.println(brand+ " : "+price+" : "+name);
	}
	public static void show1(Mobile1 obj) {
		System.out.println("Your brand is "+obj.brand);
		System.out.println("Your price is "+obj.price);
		System.out.println("Your name  is "+obj.name);
	}
}
public class Static_block {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Phone p1= new Phone ();
//		Phone p2= new Phone();
//		p1.brand="Samsung ";
//		p2.brand="Nokia";
//		p1.show();
//		p2.show();
		
		Class.forName("Phone");

	}

}
/*
 * we create a object we have 2 step:
 * class loads and then object are instantiated
 * in jvm we have class loader area  wheere class loads
 * and it happens first and only once
 * if u dont create a object it won't load the class
 *->if we want to acheive that  we can use Class
 */ 
