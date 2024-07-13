package Java_oops;

class Human{
	private int age=34;
	private String name="Kaushal";
	
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	
	public void setage(int x) {
		this.age=x;
	}
	
	public void setname(String n) {
		name=n;
	}
}
public class Encapsulation {
	public static void main(String a[] ){
		Human h1= new Human();
//		h1.age=21;
//		h1.name="Kaushal";
		h1.setage(23);
		h1.setname("Yash");
		
		System.out.println(h1.getage()+" "+ h1.getname());
		
		
		
	}
	
}
//we are binding data with the methods the only way to access the data is with methods
//so no one from outside can use your variable directly so we are encapsulating the data 
//and methods and thats encapsulation