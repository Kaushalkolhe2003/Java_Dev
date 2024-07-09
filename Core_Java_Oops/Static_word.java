package Java_oops;

class Mobile{
	String brand;
	int price;
	static  String name;
	
	public void show() {
		System.out.println(brand+ " : "+price+" : "+name);
	}
}
public class Static_word {

	public static void main(String[] args) {
		 Mobile m1= new Mobile();
		 m1.name="kaushal";
		 m1.price=12000;
		 m1.brand="samsung";
		 
		 Mobile m2= new Mobile();
		 m2.name="kaushal";
		 m2.price=12000;
		 m2.brand="samsung";
		 
		 Mobile.name="Motorola";
		 m1.name="Nokia";  
		 m1.show();
		 m2.show();
		 

	}

}
//static variable is share by all the object
//if one object change the variable the value at other 
//object is also affected....
//as a static varaible common for all obj we can called 
//it by class name 
//static means we are making something as class member..
