package com.embed.Embeddable_obj;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentData")
public class Std_Data {
	@Id
	private int roll_no;
	private String Name;
	private String Gender;
	private String Blood_grp;
	
	@Embedded
	private Parent_info p ; //embeddable object 
	
	
	public Parent_info getP() {
		return p;
	}
	public void setP(Parent_info p) {
		this.p = p;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBlood_grp() {
		return Blood_grp;
	}
	public void setBlood_grp(String blood_grp) {
		Blood_grp = blood_grp;
	}
	
}
