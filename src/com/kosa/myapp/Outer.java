package com.kosa.myapp;

public class Outer {
	class Inner {

	}// member inner class (instance inner class)

	static class StaticInner {
		// static 변수 또는 static 메서드를 가질 때
	}// member inner class (static inner class)

	void doIt() {
		class LocalInner {

		}// local inner class
	}

	void doThat() {
		// static int b=10; 메서드 안에서 static 지역변수, 클래스 선언불가
		class LocalInner {
			int a;

			void doSomething() {

			}

		}
		new LocalInner().doSomething();
	}
}

class Other {

}
