package com.example.SpringbootMvc2.model;

public class Devloper {
	public Devloper(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Devloper [id=" + id + ", name=" + name + "]";
	}
	
	
	 

}
