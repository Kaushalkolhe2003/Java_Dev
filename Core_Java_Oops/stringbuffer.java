package Java_oops;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Kolhe");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" Kaushal"));
		
		
		String normal = sb.toString();
		System.out.println(normal);
		sb.insert(0, "Mrs ");
		System.out.println(sb);

	}

}
