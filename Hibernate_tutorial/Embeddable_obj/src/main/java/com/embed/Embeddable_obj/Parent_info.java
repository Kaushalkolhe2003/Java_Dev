package com.embed.Embeddable_obj;

import javax.persistence.Embeddable;

@Embeddable
public class Parent_info {
	private String  Father_N;
	private String Mother_N;
	private String Mobile_no;
	
	@Override
	public String toString() {
		return "Parent_info [Father_N=" + Father_N + ", Mother_N=" + Mother_N + ", Mobile_no=" + Mobile_no + "]";
	}
	public String getFather_N() {
		return Father_N;
	}
	public void setFather_N(String father_N) {
		Father_N = father_N;
	}
	public String getMother_N() {
		return Mother_N;
	}
	public void setMother_N(String mother_N) {
		Mother_N = mother_N;
	}
	public String getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}

	
	
	
	
}
