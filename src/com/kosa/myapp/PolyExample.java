package com.kosa.myapp;

public class PolyExample {

	public static void main(String[] args) {
		//다형성을 설명합니다. poly+morph 하나의 객체가 여러개의 타입으로 사용이된다
		Person p1= new Person("홍길동",30);
		Student s2=new Student("홍길서",24,"컴퓨터과학");
		//일반적으로 선언한 타입과 생성한 타입이 같다
		
		//상속 관계가 있다면 (다형성은 상속관계가 있는 상황에서만 가능) 타입 변환이 가능하다
		Person p2=new Student("홍길남",23,"인공지능"); //p2는 선언한 타입과 생성한 타입이 다르다
		//p2는 한 자료형으로만 사용할 수 있는것이 아님, 여러 자료형을 사용할 수있음
		p2.printInfo();
		p2=new Teacher("이순신",40,"항해학");
		p2.printInfo(); //p2는 다형적 개체
		
		/*Student s2=new Person("홍길동",20);  //error
		Student s2=new Teacher("홍길동",40,"정보통신");*/ //error
		
		//배열에 다형성이 적용되면 Homogeneous collection(동종모음)이 Heterogeneous collection(이종모음)이 됨
		Person[] personList= new Person[3];
		personList[0]=p1;
		personList[1]=s2;
		personList[2]=p2;
		
		Object[] objList=new Object[5];
		objList[0]=p1;
		objList[1]=personList;
		objList[2]="Hello Java";
		objList[3]=s2;
		objList[4]=100;
		
		Person e1=new Employee("홍길복",32,"총무처");
		e1.printInfo(); //다형적 객체로 참조시 컴파일 할 때는 선언한 클래스의 멤버를 찾고 실행시 생성한 클래스의 멤버를 실행
		// Virtual Method Invocation
		Employee e2=(Employee)e1; //더 작은 타입으로 강제 형변환
		e2.printInfo();
		//다형적 객체로 메서드 호출 시, 그 메서드가 선언한 클래스에 없을 경우 컴파일 에러
		//생성한 타입으로 형변환 후 호출해야 함
		Student s3=(Student)objList[3];
		s3.printInfo();
		
		printPersonInfo(p1);
		printPersonInfo(new Student("허진경",29,"디지털학과")); //다형적 인자
	}
	public static void printPersonInfo(Person p) {
		System.out.println("==================");
	
		if(p instanceof Student) {
			System.out.println("   학생 정보 ");
		}else if(p instanceof Employee) {
			System.out.println("   교사 정보 ");
		}else if(p instanceof Employee) {
			System.out.println("   직원 정보");
		}else if(p instanceof Person) { //부모의 타입과 비교하는 조건문이아래에 와야 한다
			System.out.println("   Person Info   ");
		}
		System.out.println("------------------");
		p.printInfo();
		System.out.println("==================");
		
	}
}
