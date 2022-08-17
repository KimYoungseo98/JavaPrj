package com.kosa.myapp;
//value object
public class Member {
	//회원 정보는 이름, 나이, 전화번호, 이메일
	private String name;
	private int age;
	private String phone;
	private String email;
	
	public Member() {
		super();
	}
	public Member(String name, int age, String phone, String email) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public void doIt() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<0) {
			age=0;
		}
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
