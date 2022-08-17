package com.kosa.myapp;

public class Person {
	private String name;
    private int age;
    
    //constructor
	public Person(String name, int age) {
		super(); //Object 클래스의 생성자를 실행함
		this.name = name;
		this.age = age;
	}
	//setter/getter ->필드를 private으로 선언해 변경불가하게했을 때 접근방법
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
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void printInfo() {
		System.out.println("이름: "+name );
		System.out.println("나이: "+age);
		//System.out.println("전공: "+major); 자식에있는것은 못가져다씀 자식 클래스에서 재정의 필요
	}
    

}
