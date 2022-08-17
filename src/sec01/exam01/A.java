package sec01.exam01;

public class A { //바깥클래스
	A() {
		System.out.println("A객체가 생성됨");
	}
	//인스턴스멤버클래스
	class B { //인스턴스 멤버 클래스는 인스턴스 필드나 인스턴스 메소드에서 객체를 생성할 수 있으나
		B() {//정적 필드나 정적 메소드에서는 객체를 생성할 수 없다
			System.out.println("B객체가 생성됨");
		}

		int field1;

		void method1() {
		}
	}
	//정적멤버클래스
	static class C { //반면 정적 멤버 클래스는 모든 필드의 초기값이나 모든 메소드에서 객체를 생성할 수 있다
		C() {
			System.out.println("C객체가 생성됨");
		}

		int field1; //정적 클래스안에서는 바깥 메소드의 정적 필드와 메소드에만 접근가능하다
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}
	
	void method() {
		class D { //로컬멤버클래스
			D() {
				System.out.println("D객체가 생성됨");
			}

			int field1;

			void method1() {
			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();

	}
}
