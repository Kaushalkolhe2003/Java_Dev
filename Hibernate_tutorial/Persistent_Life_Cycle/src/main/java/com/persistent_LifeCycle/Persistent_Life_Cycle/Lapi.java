package com.persistent_LifeCycle.Persistent_Life_Cycle;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lapi {
	@Id
	private int aid;
	private String brand;
	private int price;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Lapi [aid=" + aid + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
