package com.kosa.myapp;

public class Employee extends Person {
//	   String name;
//	   int age;
	private String department;

	public Employee(String name, int age, String department) {
		super(name, age); //private인 부모의 멤버변수를 부모의 생성자를 이용해서 초기화
		//부모가 public일 경우 this. 사용가능
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void printInfo() { //재정의
		super.printInfo();// private인 부모의 변수나 메서드 호출
		System.out.println("담당부서: "+department);
	}

}