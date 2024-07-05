package Java_oops;

class Calculator{
	int n1=0;
	int n2=0;
	int n3=0;
	int num;
	public Calculator(int n1,int n2,int n3) {
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		
	}
	
	public int add(int n1,int n2) {
		int result = n1+n2;
		
		return result;
		
	}
	public int add(int n1,int n2,int n3) {
		int result=n1+n2+n3;
		return result;
	}
}

public class Method_overloading {

	public static void main(String[] args) {
		Calculator calci= new Calculator(2,4,6);
		System.out.println(calci.add(calci.n1,calci.n2));
		System.out.println(calci.add(calci.n1,calci.n2,calci.n3));
		calci.num=34;
		System.out.println(calci.num);
		Calculator calci1 = new Calculator(3,4,6);
		calci1.num=21;
		System.out.println(calci1.num);
	}

}
