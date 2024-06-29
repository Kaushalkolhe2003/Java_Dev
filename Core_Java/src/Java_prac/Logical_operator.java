package Java_prac;

import java.util.Scanner;

public class Logical_operator {

	public static void main(String[] args) {
		//  &-> and , | -> or ,!->not
		 /*
		  * for and      
		  * t t -> t
		  * t f-> f
		  * f f-> f
		  * f t-> f
		  * for or     
		  * t t -> t
		  * t f-> t
		  * f f-> f
		  * f t-> t
		  * 
		  * 
		  */
		
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		
		boolean result= x>y && a>b; // and operator
		boolean result1= x>y || a>b; // or operator
		
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println(!result);
		
		
		
		

	}

}
