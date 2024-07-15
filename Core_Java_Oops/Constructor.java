package Java_oops;

class Department {
    int intake;
    String branch;
    
    public Department() { //default constructor 
    	intake=60;
    	branch="entc";
    }

    //parameterised constructor...
    
    public Department(int x, String y) {
        System.out.println("Constructor is called");
        this.intake = x;
        this.branch = y;
    }

    public int getIntake() {
        return intake;
    }

    public void setIntake(int intake) {
        this.intake = intake;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Department d1 = new Department(180, "Mechanical");
        System.out.println(d1.getIntake() + " " + d1.getBranch());
        
        Department d2 = new Department();
        System.out.println(d2.getIntake() + " " + d2.getBranch());
        
    }
}
