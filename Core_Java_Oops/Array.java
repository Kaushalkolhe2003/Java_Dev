package Java_oops;
import java.util.*;
class Array {

	public static void main(String[] args) {
		int num[]= {12,3,4,5,34,2};
		
		int num1[] = new int[5];
		
		for(int i=0;i<6;i++) {
			System.out.println(num[i]);
		}
		System.out.println();
		
		int num2[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num2[i][j]+" ");
			}
			System.out.println();
		}
		
		//enhance for loop
		for(int n[]: num2) {
			for(int m : n) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		}
	
		
		
		
	}


