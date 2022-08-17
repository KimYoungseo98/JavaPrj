package sec02.exam01;

public class Anonymous {
	Person field=new Person() {
		void work() {
			System.out.println("출근합니다");
		}
		
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	}; //필드의 초기값으로 익명 객체 대입
	
	void method1() {
		Person localVar=new Person() {
			void walk() {
				System.out.println("산책합니다");
			}
			void wake() { //익명 자식 객체는 부모의 타입에 선언된 것만 사용할 수 있기 때문에 method1을 호출하면 wake가 먼저 실행
				System.out.println("7시에 일어납니다");
				walk();
			}
		}; //로컬 변수값으로 익명 객체 대입
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
