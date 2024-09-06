package com.Emp.Spring2;

public class Employee {
	
	private  int salary;
	private Interns intern;
	

//	public Employee() {
//		System.out.println("Start the project ");
//	}
	public Employee(int salary) {
		
		this.salary = salary;
	}
	public void Devlopement() {
		System.out.println("Im coding...");
		intern.Learn();
	}
	//getter and setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Interns getIntern() {
		return intern;
	}
	public void setIntern(Interns intern) {
		this.intern = intern;
	}
}
