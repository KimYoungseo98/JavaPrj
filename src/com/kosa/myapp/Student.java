package com.kosa.myapp;

public class Student extends Person {
//	   String name;
//	   int age;
	private String major;

	public Student(String name, int age, String major) {
		super(name, age); // 부모의 생성자 호출
		this.major = major;
	}
	@Override
	public void printInfo() {
		//System.out.println("이름: "+name); //name의 접근 제한자 private 이기 때문에 못가져옴
		super.printInfo();//person(부모)이 프린트하는 것을가져옴
		System.out.println("전공: "+major);
	}
}