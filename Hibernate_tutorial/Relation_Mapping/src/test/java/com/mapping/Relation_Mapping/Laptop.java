package com.mapping.Relation_Mapping;

import java.util.*;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int Lid;
	private String Lname;
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getName() {
		return Lname;
	}
	public void setName(String name) {
		this.Lname = name;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", name=" + Lname + "]";
	}
	
	
}
