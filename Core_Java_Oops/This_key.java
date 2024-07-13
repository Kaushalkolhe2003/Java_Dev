package Java_oops;
class Std{
	private int  sr_no;
	private String name;
	public int getSr_no() {
		return sr_no;
	}
	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
}
public class This_key {

	public static void main(String args[]) {
		Std s1 = new Std();
		s1.setSr_no(1);
		s1.setName("abhi");
		System.out.println(s1.getName()+" -> "+ s1.getSr_no());
		
		
	}
	
}
//this is the  keyword which represent current object (object that is calling something)