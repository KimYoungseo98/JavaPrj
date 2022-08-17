package com.kosa.myapp.in;

public class Outer {

	void doit(final int a) {// 지역변수(매개변수)
		final int b = 10;// 지역변수
		class LocalInner {
			int c; // 멤버변수

			void doLocal() {
				int d; // 지역변수
				// 여기에서 참조하는 외부클래스의 지역 변수는 final이여야 함.
				d = a + b;
			}
		}
	}
}
