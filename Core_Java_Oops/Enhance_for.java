package Java_oops;

public class Enhance_for {

	public static void main(String[] args) {
		int  num[]= new int [5];
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random() *100);
		}
		//enhanced for loop
		for (int n: num) {
			System.out.println(n);
		}
		
	}

}
