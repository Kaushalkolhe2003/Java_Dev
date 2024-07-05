package Java_oops;
class student {
	int roll_no;
	String name;
	int marks;
	
	
}
public class Array_object {

	public static void main(String[] args) {
		
		student s1 = new student();
		s1.roll_no=1;
		s1.name="kaushal";
		s1.marks=34;
		
		student s2 = new student();
		s2.roll_no=1;
		s2.name="kamlesh";
		s2.marks=31;
		
		student s3 = new student();
		s3.roll_no=3;
		s3.name="mohan";
		s3.marks=38;
		
		student students[] = new student[3];
		
		students[0]=s1;
		students[1]=s2;
		students[2 ]=s3;
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name +" : "+students[i].marks);
		}
		
		
		//in this we created array which can hold students
		//references in it
		
		
//		int num[]= new int [4];
//		num[0]=4;
//		num[1]=8;
//		num[2]=3;
//		num[3]=9;
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}

	}

}
