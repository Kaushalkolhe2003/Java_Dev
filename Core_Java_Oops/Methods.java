package Java_oops;
class Computer
{
	public void playMusic(){
		System.out.println("Music Playing ");
	}
	public String  getmeapen(int cost) {
		if(cost>=10) {
			return "pen";
		}
		return "nopen";
		  
	}
	
}

public class Methods {
	public static void main(String args[]) {
		Computer com = new Computer();
		com.playMusic();
		String str = com.getmeapen(23);
		System.out.println(str);
		
	}

}
