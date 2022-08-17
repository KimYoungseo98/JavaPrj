package com.kosa.myapp;

public class Teacher extends Person {
//	   String name;
//	   int age;
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age); // 부모의 멤버변수가 private 이기 때문에 필수로 써줘야함
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	//printInfo()메서드를 재정의하시오
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("담당과목: "+subject);
	}
	

}