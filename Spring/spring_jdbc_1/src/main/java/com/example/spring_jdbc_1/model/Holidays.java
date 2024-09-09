package com.example.spring_jdbc_1.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Holidays {
	private int Id;
	private String Name;
	private int Ticket_ID;
	private String Lunch;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getTicket_ID() {
		return Ticket_ID;
	}
	public void setTicket_ID(int ticket_ID) {
		Ticket_ID = ticket_ID;
	}
	public String getLunch() {
		return Lunch;
	}
	public void setLunch(String lunch) {
		Lunch = lunch;
	}
	@Override
	public String toString() {
		return "Holidays [Id=" + Id + ", name=" + Name + ", Ticket_ID=" + Ticket_ID + ", Lunch=" + Lunch + "]";
	}
	
}
