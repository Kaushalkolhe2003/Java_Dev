package Java_prac;

public class Switch_case2 {

	public static void main(String[] args) {
		String day="Monday";
		
		switch(day) {
		
		case "Sunday" , "Saturday" ->System.out.println("7am");
		
		case "Monday" -> System.out.println("6am");
		default ->System.out.println("7am");
		
		}

	}

}
