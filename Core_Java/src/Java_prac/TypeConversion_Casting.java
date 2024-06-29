package Java_prac;

public class TypeConversion_Casting {

	public static void main(String[] args) {
		//Narrowing or Explicit conversion
		//double->float->long->Int->Short->Byte
		/*
		 * If we want to assign a value of a 
		 * larger data type to a smaller data type
		 *  we perform explicit type casting or narrowing.  
		 *  
		 *  ->This is useful for incompatible data types
		 *   where automatic conversion cannot be done.
		 *   
		 *   
		 */
		 // Double datatype
        double x= 100.04;
 
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
        long l = (long)x;
 
        // Explicit type casting
        int i = (int)l;
 
        // Print statements
        System.out.println("Double value " + x);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + i); 
        
     // Declaring byte variable
        byte b;
 
        // Declaring and initializing integer and double
        int z = 257;
        double d = 323.142;
 
        // Display message
        System.out.println("Conversion of int to byte.");
 
        // i % 256
        b = (byte)z;
 
        // Print commands
        System.out.println("i = " + z + " b = " + b);
        System.out.println(
            "\nConversion of double to byte.");
 
        // d % 256
        b = (byte)d;
 
        // Print commands
        System.out.println("d = " + d + " b= " + b);
		
		
	}

}

/*
 * Widening conversion takes place when two data types are automatically converted. This happens when:  

  The two data types are compatible.
  When we assign a value of a smaller data type to a bigger data type.
  For Example, in java, the numeric data types are compatible with each other 
  but no automatic conversion is supported from numeric type to char or boolean. 
  Also, char and boolean are not compatible with each other. 
 * 
 */
