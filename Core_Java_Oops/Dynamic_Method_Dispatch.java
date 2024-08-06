package Java_oops;
class Product {
	public void calculateshipping() {
		System.out.println("Calculating shipping cost for generic product");
	}
}
class Electronic extends Product{
	@Override
	public void calculateshipping() {
		  System.out.println("Calculating shipping cost for electronics");
	}
}
class Books extends Product {
    @Override
    public void calculateshipping() {
        System.out.println("Calculating shipping cost for books");
    }
}
class Furniture extends Product {
    @Override
    public void calculateshipping() {
        System.out.println("Calculating shipping cost for furniture");
    }
}

public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
        Product product;

        product = new Electronic(); // Electronics object assigned to Product reference
        product.calculateshipping(); // Calls Electronics's calculateShipping method

        product = new Books(); // Books object assigned to Product reference
        product.calculateshipping(); // Calls Books's calculateShipping method

        product = new Furniture(); // Furniture object assigned to Product reference
        product.calculateshipping(); // Calls Furniture's calculateShipping method
    }

}


/*
 * 
 * 
 * Reference Variable:

The Product reference variable product can refer to objects of its subclasses Electronics, Books, and Furniture.
Object Type Determination:

At runtime, the JVM determines the actual object type (Electronics, Books, or Furniture) and calls the corresponding overridden calculateShipping method.
Method Call Resolution:

When product.calculateShipping() is called, the JVM dynamically dispatches the call to the appropriate method implementation based on the actual object type.
*/