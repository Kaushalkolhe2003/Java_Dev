package Java_oops;
class Z{
	public final void show() {
		System.out.println("In a Calci Show");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
class Advcal extends Z{
//	public void show() {
//		System.out.println("hii kaushal");
//	}
}
public class Final_Key {
public static void main(String a[]) {
	final int  num=9;
	
	System.out.println(num);
	
	Advcal x= new Advcal();
	x.show();
	x.add(12, 13);
}
}


//final key can be use with variable ,method and class

//Once you assign your value to variable which is final can be chnaged.

//Once you make your class final you stop inheritance no one can extends it. 

//Once you make your method final in sub class you cant override it .
