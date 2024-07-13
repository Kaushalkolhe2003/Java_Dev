package com.server;

public class Employee {
	
	



	int sr_no;
	String name;
	
	
	
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



	public Employee(int x,String y) {
		super();
		this.sr_no=x;
		this.name=y;
		
	}
	@Override
	public String toString() {
		return "Employee [sr_no=" + sr_no + ", name=" + name + "]";
	}
	
	
	
}
