package com.JPA.Demo_JPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	private int aid;
	private String name;
	private String skills;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Demo [aid=" + aid + ", name=" + name + ", skills=" + skills + "]";
	}
	
	
	
}
