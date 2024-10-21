package com.javaex.vo;

public class PhoneListVo {
	
	//필드
	private int no;
	private String name;
	private String hp;
	private String company;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	@Override
	public String toString() {
		return "PhoneListVo [no=" + no + ", name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	

}
