package Java_oops;

class Calci{
	int a;
	
	 public  int add(int num1,int num2) {
		  int r= num1+num2;
		  return  r;
		 
	 }
}
public class Class_obj {

	public static void main(String[] args) {
		Calci csl= new Calci();
		
		int result =csl.add(1,4);
		System.out.println(result);

	}

}

//oops ->
/*object->property and behaviour...
 *  
 * 
 */
