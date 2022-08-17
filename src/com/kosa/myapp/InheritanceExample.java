package com.kosa.myapp;

public class InheritanceExample {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 26, "컴퓨터");
		//s1.name = "홍길동"; // name은 student엔 없니만 사용 가능
		s1.printInfo();
		Teacher t1=new Teacher("이순신",40,"항해학");
		t1.printInfo();
		Person p1=new Person("홍길서",23);
		p1.printInfo();
		Employee e1=new Employee("부승관",25,"케이팝");
		e1.printInfo();
	}

}
