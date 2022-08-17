package sec02.exam01;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b; //부모 타입으로 자동 형변환
		A a2 = c; //부모타입으로 형변환되면 자식에서 오버라이딩한 메소드는 호출 불가능하다
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;

	}

}
