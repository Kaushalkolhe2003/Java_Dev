package Java_oops;
class X{
	public X() {
		super();
		System.out.println("in X ");
	}
	public X(int n) {
		super();
		System.out.println("in parameterized constructor X");
	}
}
class Y extends X{
	public Y() {
		super();
		System.out.println("in B");
	}
	public Y(int n) {
		this();
		System.out.println("in parameterized constructor");
	}
}

public class Super_Method {
	public static void main(String a[]) {
		Y obj = new Y(5);
	}

}


//Every constructor in java has a method  even u dont method and 
// that method is super()
//every class in java extend Object  class