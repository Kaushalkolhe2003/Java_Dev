package Java_prac;


public class Conditional_Statement {

	public static void main(String[] args) {
		
		int x=5;
		if(x<10) {
			
			System.out.println("ByE");
			
		}
		else {
			System.out.println("Morning");
		}
		int a=23;
		int b=3;
		if(a<b) {
			System.out.println(a);
			
		}
		else{
			System.out.println(b);
		}
		
		//else if ladder
		
		if(x>a) {
			System.out.println(x);
		}
		else if(a>x) {
			System.out.println(a);
			
		}
		else {
			System.out.println("ERROR");
		}
		
		//ternary operator...
	
		boolean  sum = (a+b)>30 ? true : false;
		System.out.println(sum);
	}

}
