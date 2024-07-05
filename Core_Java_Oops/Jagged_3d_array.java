package Java_oops;

public class Jagged_3d_array {

	public static void main(String[] args) {
		int nums[][]=  new int[3][]; //jagged array
		
		nums[0]= new int [3];
		nums[1]= new int [5];
		nums[2]= new int [6];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]= (int)(Math.random() *100);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+ " ");
			}
			 System.out.println();
		}
		
	}

}
