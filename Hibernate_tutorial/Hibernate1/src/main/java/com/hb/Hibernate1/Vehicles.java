package com.hb.Hibernate1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicles_table")
public class Vehicles {
	@Id
	private int ID;
	private String name;
	@Column(name="car_name")
	private String Color;
	
	 
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	@Override
	public String toString() {
		return "Vehicles [ID=" + ID + ", name=" + name + ", Color=" + Color + "]";
	}
	
	
}